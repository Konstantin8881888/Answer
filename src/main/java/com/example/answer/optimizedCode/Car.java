package com.example.answer.optimizedCode;


public abstract class Car
{
    private final Engine engine;
    private final String color;
    private final String name;

    abstract void open();

    protected void start()
    {
        System.out.println("Car " + getName() + " with color " + getColor() + " starting");
    }

    public String getColor()
    {
        return color;
    }

    public String getName()
    {
        return name;
    }

    public Car(Engine engine, String color, String name)
    {
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "engine='" + engine.getTypeEngine() + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}


