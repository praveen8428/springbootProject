package com.example.PraveenKumar2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "reading")
public class reading {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
 
    @Column(name = "bp_reading")
    private Integer bpValue;
 
    @Column(name = "diabetics_reading")
    private Integer diabeticsValue;

    
    
 
    public reading() {
 
    }




	public reading(Long id, Integer bpValue, Integer diabeticsValue) {
		super();
		this.id = id;
		this.bpValue = bpValue;
		this.diabeticsValue = diabeticsValue;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Integer getBpValue() {
		return bpValue;
	}




	public void setBpValue(Integer bpValue) {
		this.bpValue = bpValue;
	}




	public Integer getDiabeticsValue() {
		return diabeticsValue;
	}




	public void setDiabeticsValue(Integer diabeticsValue) {
		this.diabeticsValue = diabeticsValue;
	}
    
    
} 
