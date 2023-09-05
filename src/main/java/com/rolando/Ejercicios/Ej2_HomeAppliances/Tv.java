package com.rolando.Ejercicios.Ej2_HomeAppliances;

import java.util.Scanner;

public class Tv extends HomeAppliances{
    protected int resolution;
    protected boolean TdtTuner;

    public Tv() {
    }

    public Tv(double price, String color, char powerConsumption, int weight, int resolution, boolean tdtTuner) {
        super(price, color, powerConsumption, weight);
        this.resolution = resolution;
        this.TdtTuner = tdtTuner;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isTdtTuner() {
        return TdtTuner;
    }

    public void setTdtTuner(boolean tdtTuner) {
        TdtTuner = tdtTuner;
    }

    public Tv createTv(Scanner read){
        HomeAppliances tv = super.createHomeAppliance(read);

        System.out.println("Enter the resolution of the tv (inches).");
        int inches = read.nextInt();
        System.out.println("Does the Tv has TDT tuner installed?");
        boolean tuner = read.nextBoolean();

        return new Tv(tv.price, tv.color, tv.powerConsumption, tv.weight, inches, tuner);
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if (this.resolution>=40){
            this.price *= 1.30;
        }
        if (this.TdtTuner){
            this.price +=500;
        }
    }
}
