package com.rolando.Ejercicios.Ej4_GeometricFormulas;

public class Circle implements Calculations{
    //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Calculations.PI * (radius * radius);
    }

    @Override
    public double perimeter() {
        return Calculations.PI * (radius *2);
    }
}
