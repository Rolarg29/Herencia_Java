package com.rolando.ManosALaObra.Persona;

public class App {
    public static void main(String[] args) {
        Persona persona = new Persona("Rolando");
        Perro perro = new Perro();

        persona.hablar();
        perro.comer();
    }
}
