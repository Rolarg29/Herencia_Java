package com.rolando.ManosALaObra.HerenciaMultiple;

public class Abuelo {
    protected String nombre;
    public Abuelo() {
        this.nombre = "Abuelo";
    }

    protected void metodoAbuelo(){
        System.out.println("Soy abuelo");
    }
}
