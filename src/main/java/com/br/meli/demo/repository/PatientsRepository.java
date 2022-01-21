package com.br.meli.demo.repository;

import com.br.meli.demo.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRepository extends JpaRepository<Patients, Long> {
}
