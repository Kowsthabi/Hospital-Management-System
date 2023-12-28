package com.example.demo.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Model.Doctor;
import com.example.demo.Service.DoctorService;

@RestController
@RequestMapping("/api/doctors")
@CrossOrigin(origins = "http://localhost:3000")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

//    @PostMapping("/login")
//    public ResponseEntity<String> doctorLogin(@RequestBody Map<String, String> credentials) {
//        String username = credentials.get("username");
//        String password = credentials.get("password");
//
//        if (doctorService.isValidCredentials(username, password)) {
//            return ResponseEntity.ok("Doctor logged in successfully");
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Doctor authentication failed");
//        }
//    }

    @PostMapping("/save")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/getByUsername")
    public Optional<Doctor> getDoctorByUsername(@RequestParam String username) {
        return doctorService.getDoctorByUsername(username);
    }

    @GetMapping("/{name}")
    public Optional<Doctor> getDoctorByName(@PathVariable String name) {
        return doctorService.findByName(name);
    }
}
