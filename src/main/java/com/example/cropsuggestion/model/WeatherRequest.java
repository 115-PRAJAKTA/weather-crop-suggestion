package com.example.cropsuggestion.model;

public class WeatherRequest {
    private double temperature;
    private double rainfall;
    private String season;

    // Getters and Setters
    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) { this.temperature = temperature; }

    public double getRainfall() { return rainfall; }
    public void setRainfall(double rainfall) { this.rainfall = rainfall; }

    public String getSeason() { return season; }
    public void setSeason(String season) { this.season = season; }
}
