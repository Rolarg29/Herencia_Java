package com.rolando.Ejercicios.Ej1_Animal;

public class Animal {
    protected String name;
    protected String food;
    protected int age;
    protected String race;

    public Animal(String name, String food, int age, String race) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.race = race;
    }

    protected void alimentarse(){
        System.out.println(name + " se alimenta de "+this.food+".");
    }
}

class Pajaro extends Animal {

    public Pajaro(String name, String food, int age, String race) {
        super(name, food, age, race);
    }
}

class Caballo extends Animal{

    public Caballo(String name, String food, int age, String race) {
        super(name, food, age, race);
    }
}

class Gato extends Animal{
    public Gato(String name, String food, int age, String race) {
        super(name, food, age, race);
    }
}

class Perro extends Animal{
    public Perro(String name, String food, int age, String race) {
        super(name, food, age, race);
    }
}

