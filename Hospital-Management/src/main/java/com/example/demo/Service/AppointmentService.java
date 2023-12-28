package com.example.demo.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Appointment;
import com.example.demo.Model.AppointmentRequest;
import com.example.demo.Model.Doctor;
import com.example.demo.Model.Patient;
import com.example.demo.Repository.AppointmentRepository;
import com.example.demo.Repository.AppointmentRequestRepo;
import com.example.demo.Repository.DoctorRepository;
import com.example.demo.Repository.PatientRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AppointmentService {

    private static final Logger log = LoggerFactory.getLogger(AppointmentService.class);

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AppointmentRequestRepo appointmentRequestRepo;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public AppointmentRequest saveappointment(AppointmentRequest appointmentRequest) {
        return appointmentRequestRepo.save(appointmentRequest);
    }

    private Patient getPatientById(Long patientId) {
        return patientRepository.findById(patientId)
                .orElseThrow(() -> {
                    log.error("Patient not found with id: {}", patientId);
                    return new EntityNotFoundException("Patient not found with id: " + patientId);
                });
    }

    private Doctor getDoctorByName(String doctorName) {
        return doctorRepository.findByName(doctorName)
                .orElseThrow(() -> {
                    log.error("Doctor not found with name: {}", doctorName);
                    return new EntityNotFoundException("Doctor not found with name: " + doctorName);
                });
    }
}
