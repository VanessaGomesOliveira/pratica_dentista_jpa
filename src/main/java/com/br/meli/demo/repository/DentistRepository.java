package com.br.meli.demo.repository;


import com.br.meli.demo.entity.Dentists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentists, Long> {

}
