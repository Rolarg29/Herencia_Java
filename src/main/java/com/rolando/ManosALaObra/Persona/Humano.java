package com.rolando.ManosALaObra.Persona;

public abstract class Humano {
    protected String name;

    public Humano(String name) {
        this.name = name;
    }

    public void hablar() {
        System.out.println("Hola, mi nombre es " + name);
    }

    public abstract void pensar();
}
