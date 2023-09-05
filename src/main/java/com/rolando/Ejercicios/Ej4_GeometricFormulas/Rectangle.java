package com.rolando.Ejercicios.Ej4_GeometricFormulas;

public class Rectangle implements Calculations{
    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width * height) * 2.0;
    }
}
