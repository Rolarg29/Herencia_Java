package com.rolando.ManosALaObra.HerenciaMultiple;

public class App {
    public static void main(String[] args) {
        Hijo hijo = new Hijo();
        System.out.println(hijo.nombre);
        hijo.metodoAbuelo();
        hijo.metodoPadre();
        hijo.metodoHijo();
    }
}
