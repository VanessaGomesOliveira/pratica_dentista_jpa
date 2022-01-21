package com.br.meli.demo.service;

import com.br.meli.demo.entity.Turns;
import com.br.meli.demo.repository.TurnsRepository;
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
public class TurnsService {

    @Autowired
    TurnsRepository turnsRepository;

    public void save(Turns turn){
        this.turnsRepository.save(turn);
    }

    public List<Turns> getAllTurns(){
        return this.turnsRepository.findAll();
    }

}
