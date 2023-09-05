package com.rolando.Ejercicios.Ej2_HomeAppliances;

import java.util.Scanner;

public class WashingMachine extends HomeAppliances {
    protected int load;

    public WashingMachine() {
    }

    public WashingMachine(double price, String color, char powerConsumption, int weight, int load) {
        super(price, color, powerConsumption, weight);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "load=" + load +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                '}';
    }

    //METHODS
    public WashingMachine createWashingMachine(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        HomeAppliances wm = super.createHomeAppliance(read);

        System.out.println("Enter your washing machine load capacity in kg.");
        int currentLoad = read.nextInt();

        return new WashingMachine(wm.price, wm.color, wm.powerConsumption, wm.weight, currentLoad);
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if (this.load>30){
            this.price += 500;
        }
    }
}
