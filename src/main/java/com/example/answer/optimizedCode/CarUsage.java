package com.example.answer.optimizedCode;

public class CarUsage
{
        public static void main(String[] args) {
            Engine engine = new Engine("Diesel");
            LightWeightCar lightweightCar = new LightWeightCar(engine, "Red", "Light Car");
            Lorry lorry = new Lorry(engine, "Blue", "Heavy Car");

            System.out.println(lightweightCar.toString());
            System.out.println(lorry.toString());

            lightweightCar.start();
            lorry.start();

            lightweightCar.move();
            lorry.move();

            lorry.stop();
            lightweightCar.stop();

            lorry.open();
            lightweightCar.open();
        }
    }
