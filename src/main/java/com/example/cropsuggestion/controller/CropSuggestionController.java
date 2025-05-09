package com.example.cropsuggestion.controller;

import com.example.cropsuggestion.model.WeatherRequest;
import com.example.cropsuggestion.model.CropResponse;
import com.example.cropsuggestion.service.CropSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/crops")
public class CropSuggestionController {

    @Autowired
    private CropSuggestionService service;

    @PostMapping("/suggest")
    public CropResponse suggestCrops(@RequestBody WeatherRequest request) {
        return service.suggestCrops(request);
    }
}
