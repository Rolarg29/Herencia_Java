package com.rolando.Ejercicios.Ej2_HomeAppliances;


import org.junit.jupiter.api.*;

import java.util.Scanner;

public class HomeAppliancesTest {
    Scanner read = new Scanner(System.in).useDelimiter("\n");

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

        Assertions.assertEquals(1600, ha.price);
        Assertions.assertEquals(Color.RED.name(), ha.color);
        Assertions.assertEquals('F', ha.powerConsumption);
        Assertions.assertEquals(30, ha.weight);
    }

    @Test
    public void createWashingMachineTest(){

    }

    @Test
    public void washingMachineFinalPriceTest(){

    }

    @Test
    public void createTVTest(){

    }

    @Test
    public void tvFinalPriceTest(){
        Scanner read = new Scanner("red\nf\n30\n42\ntrue\n").useDelimiter("\n");
        Tv tv = new Tv().createTv(read);
        tv.finalPrice();

        Assertions.assertEquals(2580, tv.price);//1000 base + 100(F) + 600(30kg) + 30% (42) + 500
        Assertions.assertEquals(Color.RED.name(), tv.color);
        Assertions.assertEquals('F', tv.powerConsumption);
        Assertions.assertEquals(30, tv.weight);
        Assertions.assertEquals(42, tv.resolution);
        Assertions.assertTrue(tv.TdtTuner);
    }

}
