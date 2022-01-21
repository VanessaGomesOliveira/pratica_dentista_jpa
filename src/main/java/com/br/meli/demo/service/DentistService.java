package com.br.meli.demo.service;

import com.br.meli.demo.entity.Dentists;
import com.br.meli.demo.repository.DentistRepository;
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
public class DentistService {

    @Autowired
    DentistRepository dentistRepository;

    public void save(Dentists dentist){
        this.dentistRepository.save(dentist);
    }

    public List<Dentists> getAllDentists(){
        return this.dentistRepository.findAll();
    }

}