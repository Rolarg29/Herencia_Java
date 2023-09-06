package com.rolando.Ejercicios.Ej2_HomeAppliances;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej2YEj3_HomeAppliances {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
//        HomeAppliances microwave = new HomeAppliances().createHomeAppliance(read);
//        System.out.println(microwave);
//        microwave.finalPrice();
//        System.out.println(microwave);
//

//        WashingMachine wm = new WashingMachine().createWashingMachine(read);
//        System.out.println(washM);

//        Tv tv = new Tv().createTv(read);
//        System.out.println(tv);
//        tv.finalPrice();
//        System.out.println(tv);

        ArrayList<HomeAppliances> appliances = new ArrayList<>();

        HomeAppliances microwave = new HomeAppliances(1000, Color.BLACK.name(), 'F', 22);
        WashingMachine wm = new WashingMachine(1000, Color.GRAY.name(), 'A', 50, 40);
        Tv tv = new Tv(1000, Color.RED.name(), 'C', 16, 42, false);
        Tv tv2 = new Tv(1000, Color.BLUE.name(), 'B', 22, 50, true);

        addToArrayList(appliances, microwave, wm, tv, tv2);
        applyFinalPrice(appliances);
        showArrayList(appliances);

    }

    private static void applyFinalPrice(ArrayList<HomeAppliances> list) {
        for (HomeAppliances t : list) {
            t.finalPrice();
        }
    }

    public static <T> void addToArrayList(ArrayList<T> list, T... values) {
        Collections.addAll(list, values);
    }

    public static <T> void showArrayList(ArrayList<T> list){
        for (T t : list) {
            System.out.println(t);
        }
    }
}
