package com.example.PraveenKumar2.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "patient")
public class patient {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
 
    @Column(name = "patient_name")
    private String patientName;
 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reading_id")
    private reading reading;
 
    public patient() {
 
    }

	public patient(Long id, String patientName, com.example.PraveenKumar2.model.reading reading) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.reading = reading;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public reading getReading() {
		return reading;
	}

	public void setReading(reading reading) {
		this.reading = reading;
	}
    
    
    
} 