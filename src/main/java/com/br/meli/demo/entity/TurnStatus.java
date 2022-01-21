package com.br.meli.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "turn_status")
public class TurnStatus {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id_turn_status;
    private String name;
    private String description;

}
