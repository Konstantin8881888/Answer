package com.example.answer.figure;

public class Square extends Figure
{
    private double side;

    public Square(double side) {
        this.side = side;
        this.setName("Square");
    }

    @Override
    public void calculateArea() {
        setArea(side * side);
    }
}
