package com.rolando.Ejercicios.Ej1_Animal;

public class Ej1_Animal {
    public static void main(String[] args) {
      //Perro
        Animal perro = new Perro("Kaiser", "croquetas", 9, "Pastor Aleman");
        perro.alimentarse();

      //Gato
        Animal gato = new Gato("Chikis", "atún", 3, "Siamés");
        gato.alimentarse();

      //Caballo
        Animal caballo = new Caballo("Spirit", "zanahorias", 12, "Fino");
        caballo.alimentarse();

        Animal pajaro = new Pajaro("piolin", "semillas", 3, "Guacamayo");
        pajaro.alimentarse();
    }
}
