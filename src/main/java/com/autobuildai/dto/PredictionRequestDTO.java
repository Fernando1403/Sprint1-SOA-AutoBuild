package com.autobuildai.dto;

import lombok.Data;

import java.util.List;

@Data
public class PredictionRequestDTO {
    private List<String> parts;
}
