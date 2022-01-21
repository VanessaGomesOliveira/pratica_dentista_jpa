package com.br.meli.demo.service;

import com.br.meli.demo.entity.Patients;
import com.br.meli.demo.repository.PatientsRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientsService {

    @Autowired
    PatientsRepository patientsRepository;

    public void save(Patients patient){
        this.patientsRepository.save(patient);
    }

    public List<Patients> getAllPatients(){
        return this.patientsRepository.findAll();
    }
}
