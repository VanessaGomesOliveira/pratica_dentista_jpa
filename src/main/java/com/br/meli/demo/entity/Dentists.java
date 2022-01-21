package com.br.meli.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Dentists {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id_dentist;
    private String name;
    private String last_name;
    private String address;
    private String dni;
    private LocalDate birth_date;
    private BigInteger phone;
    private String email;
    private String code_mp;

}
