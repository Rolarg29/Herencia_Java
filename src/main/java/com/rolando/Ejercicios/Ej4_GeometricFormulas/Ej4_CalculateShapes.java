package com.rolando.Ejercicios.Ej4_GeometricFormulas;

public class Ej4_CalculateShapes {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3, 5);
        Circle cir = new Circle(3.5);

        System.out.println("rec.area() = " + rec.area());
        System.out.println("rec.perimeter() = " + rec.perimeter());
        System.out.println("cir.area() = " + cir.area());
        System.out.println("cir.perimeter() = " + cir.perimeter());

    }
}
