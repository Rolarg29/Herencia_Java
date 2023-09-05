package com.rolando.Extras.Ex1;

public class Velero extends Barco {
    private int mastsNumber;

    public Velero(String registration, int length, int year, int mastsNumber) {
        super(registration, length, year);
        this.mastsNumber = mastsNumber;
    }

    @Override
    public int calculateModule() {
        return super.calculateModule() + mastsNumber;
    }
}
