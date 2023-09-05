package com.rolando.ManosALaObra.Interfaces;

public class Clase implements Interfaz{

    @Override
    public void constantes() {
        System.out.println("El valor de X es: " + X);
        System.out.println("El valor de Y es: " + Y);
    }

    @Override
    public void sumar() {
        int suma = X + Y;
        System.out.println("Sumar X + Y = " + suma);
    }

    @Override
    public void restar() {
        int resta = X-Y;
        System.out.println("Restar X - Y = " + resta);
    }

    @Override
    public void presentarse() {
        System.out.println("Esta es una interfaZzz");
    }

}
