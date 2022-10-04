package com.example.PraveenKumar2.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.PraveenKumar2.model.*;
import com.example.PraveenKumar2.repository.*;
 
@RestController
@RequestMapping("/api/v1")
public class controller {
 
    @Autowired
    private patientRepository repository;
 

    @GetMapping("/patients")
    public List < patient > getpatients() {
        return repository.findAll();
    }
 
    @GetMapping("/patient/{id}")
    public ResponseEntity < patient > getpatientById(
        @PathVariable(value = "id") Long patientId) throws ResourceNotFoundException {
        patient user = repository.findById(patientId)
            .orElseThrow(() -> new ResourceNotFoundException("patient not found :: " + patientId));
        return ResponseEntity.ok().body(user);
    }
 
    @PostMapping("/patients")
    public patient createUser(@Valid @RequestBody patient patient) {
        return repository.save(patient);
    }
} 