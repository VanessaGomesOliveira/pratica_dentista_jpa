package com.br.meli.demo.service;

import com.br.meli.demo.entity.Diarys;
import com.br.meli.demo.repository.DiarysRepository;
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
public class DiarysService {

    @Autowired
    DiarysRepository diarysRepository;

    public void save(Diarys diary) {
        this.diarysRepository.save(diary);
    }

    public List<Diarys> getAllDairys(){
        return this.diarysRepository.findAll();
    }

}
