package com.autobuildai.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredictionService {

    public Integer calculatePopularity(List<String> parts){

        int score = 50;

        score += parts.size() * 10;

        if(parts.contains("Turbo GT")){
            score += 20;
        }

        return Math.min(score, 100);
    }
}
