# Weather-Based Crop Suggestion Tool

## Description
This tool suggests crops based on weather conditions such as temperature, rainfall, and season. It is built using Java and Spring Boot.

## Features
- Suggests crops for Kharif and Rabi seasons based on temperature and rainfall.
- Uses RESTful APIs to fetch weather data and recommend crops.

## Tech Stack
- Java
- Spring Boot
- Maven

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/WeatherCropSuggestionTool.git
   ```
2. Navigate to the project folder and build the project:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the API at `http://localhost:8080/api/crops/suggest`.