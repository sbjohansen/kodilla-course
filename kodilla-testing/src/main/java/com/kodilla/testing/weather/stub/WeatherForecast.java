package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        return sum / temperatures.getTemperatures().size();
    }

    public double calculateMedianTemperature() {
        double minTemp = 0;
        double maxTemp = 0;
        int i = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            if (i == 0) {
                minTemp = temperature.getValue();
                maxTemp = temperature.getValue();
            } else {
                if (temperature.getValue() < minTemp) {
                    minTemp = temperature.getValue();
                }
                if (temperature.getValue() > maxTemp) {
                    maxTemp = temperature.getValue();
                }
            }
            i++;
        }
        return (minTemp + maxTemp) / 2;
    }
}
