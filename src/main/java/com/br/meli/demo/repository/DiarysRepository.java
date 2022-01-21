package com.br.meli.demo.repository;


import com.br.meli.demo.entity.Diarys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiarysRepository extends JpaRepository<Diarys, Long> {
}
