package com.example.answer.figure;

public class Circle extends Figure
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
        this.setName("Circle");
    }

    @Override
    public void calculateArea()
    {
        setArea(Math.PI * radius * radius);
    }
}
