// Doctor.java
package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private String phoneNumber;
    private String availability;
    private String username; // Added username field
    private String password;

    public Doctor() {
        super();
    }

    public Doctor(String name, String specialization, String phoneNumber, String availability, String username, String password) {
        super();
        this.name = name;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
        this.availability = availability;
        this.username = username;
        this.password = password;
    }
    

    // getters and setters...

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
    public String toString() {
        return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization +
                ", phoneNumber=" + phoneNumber + ", availability=" + availability +
                ", username=" + username + ", password=" + password + "]";
    }
}
