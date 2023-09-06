package com.rolando.Ejercicios.Ej2_HomeAppliances;


import org.junit.jupiter.api.*;

import java.util.Scanner;

public class HomeAppliancesTest {

    @BeforeAll
    public static void setUp() {
    }

    @AfterEach
    public void tearDown(){
        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    public void homeAppliancesConstructorTest(){
        new HomeAppliances();
        new HomeAppliances(1000, Color.RED.name(),'A',200);
    }

    @Test
    public void createHomeApplianceTest(){
        Scanner read = new Scanner("red\nf\n30\n").useDelimiter("\n");
        HomeAppliances ha = new HomeAppliances();
        ha = ha.createHomeAppliance(read);

        Assertions.assertEquals(1000, ha.price);
        Assertions.assertEquals(Color.RED.name(), ha.color);
        Assertions.assertEquals('F', ha.powerConsumption);
        Assertions.assertEquals(30, ha.weight);
    }

    @Test
    public void homeApplianceFinalPrice(){
        Scanner read = new Scanner("red\nf\n30\n").useDelimiter("\n");
        HomeAppliances ha = new HomeAppliances();
        ha = ha.createHomeAppliance(read);
        ha.finalPrice();

        //1000 base + 100 powerC 'F' + 500 20-49 kg.
        Assertions.assertEquals(1600, ha.price);
        Assertions.assertEquals(Color.RED.name(), ha.color);
        Assertions.assertEquals('F', ha.powerConsumption);
        Assertions.assertEquals(30, ha.weight);
    }

    @Test
    public void createWashingMachineTest(){
        Scanner read = new Scanner("red\nf\n30\n20\n").useDelimiter("\n");
        WashingMachine wm = new WashingMachine().createWashingMachine(read);

        //1000 base
        Assertions.assertEquals(1000, wm.price);
        Assertions.assertEquals(Color.RED.name(), wm.color);
        Assertions.assertEquals('F', wm.powerConsumption);
        Assertions.assertEquals(30, wm.weight);
        Assertions.assertEquals(20, wm.load);
    }

    @Test
    public void washingMachineFinalPriceTest(){
        Scanner read = new Scanner("red\nf\n30\n35\n").useDelimiter("\n");
        WashingMachine wm = new WashingMachine().createWashingMachine(read);
        wm.finalPrice();

        //1000 base + 100 powerC 'F' + 500 20-49 kg. +500 load>20kg
        Assertions.assertEquals(2100, wm.price);
        Assertions.assertEquals(Color.RED.name(), wm.color);
        Assertions.assertEquals('F', wm.powerConsumption);
        Assertions.assertEquals(30, wm.weight);
        Assertions.assertEquals(35, wm.load);
    }

    @Test
    public void createTVTest(){
        Scanner read = new Scanner("red\nf\n30\n42\ntrue\n").useDelimiter("\n");
        Tv tv = new Tv().createTv(read);

        Assertions.assertEquals(1000, tv.price);//1000 base + 100(F) + 600(30kg) + 30% (42) + 500
        Assertions.assertEquals(Color.RED.name(), tv.color);
        Assertions.assertEquals('F', tv.powerConsumption);
        Assertions.assertEquals(30, tv.weight);
        Assertions.assertEquals(42, tv.resolution);
        Assertions.assertTrue(tv.TdtTuner);
    }

    @Test
    public void tvFinalPriceTest(){
        Scanner read = new Scanner("red\nf\n30\n42\ntrue\n").useDelimiter("\n");
        Tv tv = new Tv().createTv(read);
        tv.finalPrice();

        //1000 base + 100(F) + 600(30kg) + 30% (42'') + 500 tuner
        Assertions.assertEquals(2580, tv.price);
        Assertions.assertEquals(Color.RED.name(), tv.color);
        Assertions.assertEquals('F', tv.powerConsumption);
        Assertions.assertEquals(30, tv.weight);
        Assertions.assertEquals(42, tv.resolution);
        Assertions.assertTrue(tv.TdtTuner);
    }

}
