package com.rolando.Ejercicios.Ej2_HomeAppliances;

import java.util.Scanner;

public class Ej2_HomeAppliances {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
//        HomeAppliances microwave = new HomeAppliances().createHomeAppliance();
//        System.out.println(microwave);
//        microwave.finalPrice();
//        System.out.println(microwave);
//

//        WashingMachine washM =new WashingMachine().createWashingMachine();
//        System.out.println(washM);

        Tv tv = new Tv().createTv(read);
        System.out.println(tv);
        tv.finalPrice();
        System.out.println(tv);


    }
}
