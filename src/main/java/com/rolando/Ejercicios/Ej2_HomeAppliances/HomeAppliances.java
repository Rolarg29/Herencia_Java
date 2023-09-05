package com.rolando.Ejercicios.Ej2_HomeAppliances;

import java.util.Scanner;

public class HomeAppliances {
    protected double price;
    protected String color;
    protected char powerConsumption;
    protected int weight;

    public HomeAppliances(double price, String color, char powerConsumption, int weight) {
        this.price = price;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
    }

    public HomeAppliances() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(char powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HomeAppliances{" +
                "price=" + price +
                ", color=" + color +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                '}';
    }

    //methods
    public char checkPowerConsumption(char letter){
        if ("ABCDEF".indexOf(Character.toUpperCase(letter)) == -1) {
            return 'F';
        }else {
            return letter;
        }
    }

    public String checkColor(String color){
        if (!color.equalsIgnoreCase("blue")&&!color.equalsIgnoreCase("red")&&!color.equalsIgnoreCase("black")&&!color.equalsIgnoreCase("white")&&!color.equalsIgnoreCase("gray")){
            return "WHITE";
        }else {
            return color.toUpperCase();
        }
    }

    public HomeAppliances createHomeAppliance(Scanner read){
        System.out.println("Enter your color.");
        String color = checkColor(read.next());

        System.out.println("Enter your Power Consumption (A-F).");
        char letter = checkPowerConsumption(read.next().toUpperCase().charAt(0));

        System.out.println("Enter your weight.");
        int weight = read.nextInt();

        return new HomeAppliances(1000, color, letter, weight);
    }

    public void finalPrice(){
        switch (this.powerConsumption) {
            case 'A' -> this.price += 1000;
            case 'B' -> this.price += 800;
            case 'C' -> this.price += 600;
            case 'D' -> this.price += 500;
            case 'E' -> this.price += 300;
            case 'F' -> this.price += 100;
        }
        int w = this.weight;
        if (w>=1&&w<=19){
            this.price += 100;
        } else if (w>=20&&w<=49) {
            this.price += 500;
        } else if (w>=50&&w<=79) {
            this.price += 800;
        }else {
            this.price += 1000;
        }
    }
}