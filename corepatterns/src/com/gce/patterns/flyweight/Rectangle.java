package com.gce.patterns.flyweight;

public class Rectangle extends Shape {

    private String label;

    public Rectangle() {
        this.label = "Rectangle";
    }

    @Override
    public void draw(int lenght, int breadth, String fillStyle) {
        System.out.println("Drawing " + label + " with lenght " + lenght + " and breadth " + breadth + ", fill style " + fillStyle);

    }
}
