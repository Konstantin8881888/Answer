package com.example.answer.figure;

public class FigureAreaCalculating
{
    public static void main(String[] args)
    {
        Figure[] figures = new Figure[4];
        figures[0] = new Circle(7);
        figures[1] = new Square(15);
        figures[2] = new Triangle(2, 4);
        figures[3] = new Triangle(8, 7);

        for (Figure figure : figures)
        {
            figure.calculateArea();
            System.out.println(figure.getName() + " area: " + figure.getArea());
        }
    }
}
