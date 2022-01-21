package com.br.meli.demo.service;

import com.br.meli.demo.entity.TurnStatus;
import com.br.meli.demo.repository.TurnStatusRepository;
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
public class TurnStatusService {

    @Autowired
    TurnStatusRepository turnStatusRepository;

    public void save(TurnStatus turnStatus){
        this.turnStatusRepository.save(turnStatus);
    }

    public List<TurnStatus> getAllTurnStatus(){
        return this.turnStatusRepository.findAll();
    }
}
