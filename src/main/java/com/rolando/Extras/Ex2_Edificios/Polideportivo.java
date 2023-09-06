package com.rolando.Extras.Ex2_Edificios;

public class Polideportivo extends Edificio{
    private static int cantidadTechados, cantidadAbiertos;
    private String nombre;
    private boolean techado;

    public Polideportivo(int ancho, int largo, int alto, String nombre, boolean techado) {
        super(ancho, largo, alto);
        if (techado){
            cantidadTechados++;
        }else {
            cantidadAbiertos++;
        }
        this.nombre = nombre;
        this.techado = techado;
    }

    @Override
    public void calcularSuperficie() {
        int superficie = 2 * (ancho * largo + alto * largo + alto * ancho);
        if (techado){
            System.out.println("Superficie: "+ superficie);
        }else {
            System.out.println("Superficie: "+ (superficie-ancho*largo));
        }
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen: "+ ancho*largo*alto);
    }

    @Override
    public String toString() {
        return "Polideportivo{" +
                "nombre='" + nombre + '\'' +
                ", techado=" + techado +
                ", ancho=" + ancho +
                ", largo=" + largo +
                ", alto=" + alto +
                ", Cantidad techados=" + cantidadTechados +
                ", Cantidad Abiertos=" + cantidadAbiertos +
                '}';
    }

    public void mostrarInstalaciones(){
        System.out.println("cantidadAbiertos = " + cantidadAbiertos);
        System.out.println("cantidadTechados = " + cantidadTechados);
    }
}
