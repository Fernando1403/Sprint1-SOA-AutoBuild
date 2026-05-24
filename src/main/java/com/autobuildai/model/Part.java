package com.autobuildai.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private String brand;
    private Integer performanceScore;
}
