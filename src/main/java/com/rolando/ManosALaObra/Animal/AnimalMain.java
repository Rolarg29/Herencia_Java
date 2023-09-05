package com.rolando.ManosALaObra.Animal;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal a = new Perro();
        Animal p = new Perro();
        Animal g = new Gato();
        animals.add(a);
        animals.add(p);
        animals.add(g);
        for (Animal animal : animals) {
            animal.hacerRuido();

        }
    }
}
