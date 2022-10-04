package com.example.PraveenKumar2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PraveenKumar2.model.*;
import com.example.PraveenKumar2.controller.*;
 
@Repository
public interface patientRepository extends JpaRepository<patient, Long>{
 
}
