package com.autobuildai.controller;

import com.autobuildai.dto.PredictionRequestDTO;
import com.autobuildai.dto.PredictionResponseDTO;
import com.autobuildai.service.PredictionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prediction")
public class PredictionController {

    private final PredictionService service;

    public PredictionController(PredictionService service) {
        this.service = service;
    }

    @PostMapping
    public PredictionResponseDTO predict(@RequestBody PredictionRequestDTO request) {

        Integer score = service.calculatePopularity(request.getParts());

        String classification = score >= 80 ? "Alta" : "Média";

        return new PredictionResponseDTO(score, classification);
    }
}
