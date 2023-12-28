package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.AppointmentRequest;

public interface AppointmentRequestRepo extends JpaRepository<AppointmentRequest,Long> {

}
