package com.example.demo.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List; // Import the List class
import java.util.Optional;

import com.example.demo.Model.Patient;
import com.example.demo.Repository.PatientRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient createPatient(Patient patient) {
        // Save the patient entity and return the saved entity (with generated ID)
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        // Implement the method to get all patients
        // For example, you can use the findAll() method provided by your repository
        return patientRepository.findAll();
    }
    public Patient getPatientById(Long patientId) {
        Optional<Patient> optionalPatient = patientRepository.findById(patientId);
        if (optionalPatient.isPresent()) {
            return optionalPatient.get();
        } else {
            throw new EntityNotFoundException("Patient not found with id: " + patientId);
        }
    }
}
