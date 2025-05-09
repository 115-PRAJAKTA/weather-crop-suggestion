package com.example.cropsuggestion.service;

import com.example.cropsuggestion.model.WeatherRequest;
import com.example.cropsuggestion.model.CropResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CropSuggestionService {

    public CropResponse suggestCrops(WeatherRequest request) {
        List<String> crops = new ArrayList<>();

        if ("Kharif".equalsIgnoreCase(request.getSeason())) {
            if (request.getTemperature() > 25 && request.getRainfall() > 100) {
                crops.add("Paddy");
                crops.add("Maize");
                crops.add("Cotton");
            }
        } else if ("Rabi".equalsIgnoreCase(request.getSeason())) {
            if (request.getTemperature() < 25 && request.getRainfall() < 100) {
                crops.add("Wheat");
                crops.add("Barley");
            }
        } else {
            crops.add("Millet");
            crops.add("Pulses");
        }

        return new CropResponse(crops);
    }
}
