package com.example.answer.figure;

public class Triangle extends Figure
{
    private double base;
    private double height;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
        this.setName("Triangle");
    }

    @Override
    public void calculateArea()
    {
        setArea((base * height) / 2);
    }
}
