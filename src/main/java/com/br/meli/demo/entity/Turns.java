package com.br.meli.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Turns {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id_turn;
    private LocalDate day;
    @ManyToOne
    private Diarys diarys;
    @ManyToOne
    private TurnStatus turnstatus;
    @ManyToOne
    private Patients patients;
}
