package com.example.answer.optimizedCode;

public class LightWeightCar extends Car implements Moveable, Stopable
{
    public LightWeightCar(Engine engine, String color, String name)
    {
        super(engine, color, name);
    }

    @Override
    void open() {
        System.out.println("Car " + getName() + " with color " + getColor() + " is open");
    }

    @Override
    public void move() {
        System.out.println("Car " + getName() + " with color " + getColor() + " is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car " + getName() + " with color " + getColor() + " is stop");
    }
}
