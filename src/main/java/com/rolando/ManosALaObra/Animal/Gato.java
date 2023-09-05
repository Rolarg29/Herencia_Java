package com.rolando.ManosALaObra.Animal;

public class Gato extends Animal{

    @Override
    public void hacerRuido(){
        System.out.println("Miau");
    }

    @Override
    public void avanzar() {
        System.out.println("El gato avanza con sus patitas");
    }

    @Override
    public void frenar() {
        System.out.println("El gato se detiene");
    }
}
