package com.rolando.Extras.Ex2_Edificios;

public abstract class Edificio {
    protected int ancho, largo, alto;

    public Edificio(int ancho, int largo, int alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();
}
