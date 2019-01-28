package com.gce.patterns.adapter;

public class WeatherAdapter {
    public int findTemperature(int zipCode) {
        String city = null;

        if (zipCode == 19406) {
            city = "King Of Prussia";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        int i = finder.find(city);
        return i;
    }
}
