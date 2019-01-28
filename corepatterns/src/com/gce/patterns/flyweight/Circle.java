package com.gce.patterns.flyweight;

public class Circle extends Shape {

    private String label;


    public Circle() {
        this.label = "Circle";
    }

    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing " + label + " with radius " + radius + " Fill color " + fillColor + " line color " + lineColor);
    }
}
