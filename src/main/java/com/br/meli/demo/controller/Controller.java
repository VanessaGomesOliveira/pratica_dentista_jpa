package com.br.meli.demo.controller;
import com.br.meli.demo.entity.Dentists;
import com.br.meli.demo.entity.Patients;
import com.br.meli.demo.service.DentistService;
import com.br.meli.demo.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class Controller {

    @Autowired
    private DentistService dentistService;

    @Autowired
    private PatientsService patientsService;

    // REQUESTS FOR DENTISTS
    @GetMapping("/dentists")
    public List<Dentists> getAllDentists(){
        return this.dentistService.getAllDentists();
    }


    // REQUESTS FOR PATIENTS
    @GetMapping("/patients")
    public List<Patients> getAllPatients(){
        return this.patientsService.getAllPatients();
    }

    @PostMapping("/patients")
    public ResponseEntity<Patients> save( @RequestBody Patients patient){
        this.patientsService.save(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(patient);
    }


}
