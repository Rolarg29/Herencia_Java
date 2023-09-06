package com.rolando.Extras.Ex1_Barco;

public class Yate extends Motor{
    private int cabins;

    public Yate(String registration, int length, int year, int powerCV, int cabins) {
        super(registration, length, year, powerCV);
        this.cabins = cabins;
    }

    @Override
    public int calculateModule() {
        return super.calculateModule()+cabins;
    }
}
