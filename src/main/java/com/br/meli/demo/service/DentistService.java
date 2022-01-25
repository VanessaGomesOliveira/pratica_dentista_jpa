package com.br.meli.demo.service;

import com.br.meli.demo.entity.Dentists;
import com.br.meli.demo.repository.DentistRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

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

    public Dentists getDentistById(Long id){
        Optional<Dentists>  dentist =  this.dentistRepository.findById(id);
        return  dentist.orElse(new Dentists());
    }

    public void delete(Dentists dentist) {
        this.dentistRepository.delete(dentist);
    }

    // precisa refatorar para alteracao com campos especificos
    public Dentists put(Dentists dentist) {
       return this.dentistRepository.saveAndFlush(dentist);
    }

}
