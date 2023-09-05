package com.rolando.Extras.Ex1;

public class Barco {
    //Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
    private String registration;
    private int length;
    private int year;

    public Barco(String registration, int length, int year) {
        this.registration = registration;
        this.length = length;
        this.year = year;
    }

    public int calculateModule(){
//        Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//                alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//        multiplicando por 10 los metros de eslora).
        return length * 10;
    }
}
