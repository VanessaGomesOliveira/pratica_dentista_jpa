package com.br.meli.demo.controller;
import com.br.meli.demo.entity.Dentists;
import com.br.meli.demo.entity.Diarys;
import com.br.meli.demo.entity.Patients;
import com.br.meli.demo.service.DentistService;
import com.br.meli.demo.service.DiarysService;
import com.br.meli.demo.service.PatientsService;
import org.apache.tomcat.util.http.parser.HttpParser;
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

    @Autowired
    private DiarysService diarysService;

    // REQUESTS FOR DENTISTS
    @GetMapping("/dentists")
    public List<Dentists> getAllDentists(){
        return this.dentistService.getAllDentists();
    }

    @PostMapping("/dentists")
    public ResponseEntity<Dentists> save(@RequestBody Dentists dentists){
        this.dentistService.save(dentists);
        return ResponseEntity.status(HttpStatus.CREATED).body(dentists);
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

    @GetMapping("/diarys")
    public List<Diarys> getAllDiarys() {return this.diarysService.getAllDairys();}

    @PostMapping("/diarys")
    public  ResponseEntity<Diarys> save(@RequestBody Diarys diarys) {
        Dentists dentists = this.dentistService.getDentistById(diarys.getDentists().getId_dentist());
        if ( dentists.getId_dentist() != null ) {
            this.diarysService.save(diarys);
            return ResponseEntity.status(HttpStatus.CREATED).body(diarys);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Diarys());
    }
}
