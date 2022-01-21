package com.br.meli.demo.repository;

import com.br.meli.demo.entity.Turns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnsRepository extends JpaRepository<Turns, Long> {
}
