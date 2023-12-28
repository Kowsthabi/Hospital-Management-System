// DoctorService.java
package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Doctor;
import com.example.demo.Repository.DoctorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor createDoctor(Doctor doctor) {
        // Save the doctor entity and return the saved entity (with generated ID)
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        // Return all doctors from the repository
        return doctorRepository.findAll();
    }

    public Optional<Doctor> getDoctorById(Long id) {
        // Return a doctor by ID from the repository
        return doctorRepository.findById(id);
    }

    public Optional<Doctor> getDoctorByUsername(String username) {
        // Return a doctor by username from the repository
        return doctorRepository.findByUsername(username);
    }

    public Optional<Doctor> login(String username, String password) {
        // Return a doctor by username and password from the repository
        return doctorRepository.findByUsernameAndPassword(username, password);
    }
    
    public boolean isValidCredentials(String username, String password) {
        Optional<Doctor> optionalDoctor = doctorRepository.findByUsernameAndPassword(username, password);
        return optionalDoctor.isPresent();
    }

    public Optional<Doctor> findByName(String name) {
        return doctorRepository.findByName(name);
    }
   
    
	
}
