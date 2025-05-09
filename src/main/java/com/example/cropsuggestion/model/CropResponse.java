package com.example.cropsuggestion.model;

import java.util.List;

public class CropResponse {
    private List<String> suggestedCrops;

    public CropResponse(List<String> suggestedCrops) {
        this.suggestedCrops = suggestedCrops;
    }

    public List<String> getSuggestedCrops() {
        return suggestedCrops;
    }

    public void setSuggestedCrops(List<String> suggestedCrops) {
        this.suggestedCrops = suggestedCrops;
    }
}
