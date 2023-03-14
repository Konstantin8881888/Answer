package com.example.answer.figure;

public abstract class Figure {
    private double area;
    private String name;

    public abstract void calculateArea();

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }


}