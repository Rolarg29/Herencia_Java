package com.rolando.ManosALaObra.HerenciaMultiple;

public class Hijo extends Padre{
    protected void metodoHijo(){
        System.out.println("Soy hijo");
        System.out.println(super.nombre);
    }
}
