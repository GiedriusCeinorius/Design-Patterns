package com.gce.patterns.adapter;

public class WeatherUI {

    public void showTemperature(int zipCode) {
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findTemperature(zipCode));
    }

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        ui.showTemperature(19406);
    }
}
