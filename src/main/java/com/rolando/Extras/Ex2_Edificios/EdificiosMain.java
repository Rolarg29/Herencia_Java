package com.rolando.Extras.Ex2_Edificios;

import java.util.ArrayList;

import static com.rolando.Ejercicios.Ej2_HomeAppliances.Ej2YEj3_HomeAppliances.*;

public class EdificiosMain {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();

        Polideportivo poli1 = new Polideportivo(40,80, 160, "Poli1", true);
        Polideportivo poli2 = new Polideportivo(40,80, 160, "Poli2", false);
        Oficina oficina1 = new Oficina(50,100, 200, 1, 6, 12);
        Oficina oficina2 = new Oficina(60,110, 220,1, 5, 15);

        addToArrayList(edificios,poli1,poli2,oficina1,oficina2);

        for (Edificio edificio : edificios) {
            System.out.println(edificio);
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            if (edificio instanceof Polideportivo){
                ((Polideportivo) edificio).mostrarInstalaciones();
            }
            if (edificio instanceof Oficina){
                ((Oficina) edificio).cantidadPersonas();
            }
            System.out.println();
        }
    }
}
