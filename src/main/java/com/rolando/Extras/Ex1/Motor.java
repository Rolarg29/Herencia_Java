package com.rolando.Extras.Ex1;

public class Motor extends Barco{
    protected int powerCV;

    public Motor(String registration, int length, int year, int powerCV) {
        super(registration, length, year);
        this.powerCV = powerCV;
    }

    @Override
    public int calculateModule() {
        return super.calculateModule()+powerCV;
    }
}
