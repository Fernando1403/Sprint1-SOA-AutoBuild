package com.autobuildai.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer popularityScore;
}
