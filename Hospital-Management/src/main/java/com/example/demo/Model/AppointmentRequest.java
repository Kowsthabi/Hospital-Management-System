package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AppointmentRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long patientId;
    private String doctorName;
    private String appointmentDateTime;
    private String status;
	public AppointmentRequest() {
	}
	public AppointmentRequest(Long patientId, String doctorName, String appointmentDateTime, String status) {
		super();
		this.patientId = patientId;
		this.doctorName = doctorName;
		this.appointmentDateTime = appointmentDateTime;
		this.status = status;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getAppointmentDateTime() {
		return appointmentDateTime;
	}
	public void setAppointmentDateTime(String appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AppointmentRequest [patientId=" + patientId + ", doctorName=" + doctorName + ", appointmentDateTime="
				+ appointmentDateTime + ", status=" + status + "]";
	}
    

}