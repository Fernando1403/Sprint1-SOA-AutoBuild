package com.autobuildai.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PredictionResponseDTO {

    private Integer scorePopularidade;
    private String classificacao;
}
