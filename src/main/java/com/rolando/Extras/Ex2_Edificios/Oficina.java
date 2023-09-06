package com.rolando.Extras.Ex2_Edificios;

public class Oficina extends Edificio{
    private int numeroOficinas, personasPorOficina, numeroPisos;

    public Oficina(int ancho, int largo, int alto, int numeroOficinas, int personasPorOficina, int numeroPisos) {
        super(ancho, largo, alto);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie: "+ (2 * (ancho * largo + alto * largo + alto * ancho)));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen: "+ ancho*largo*alto);
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "numeroOficinas=" + numeroOficinas +
                ", personasPorOficina=" + personasPorOficina +
                ", numeroPisos=" + numeroPisos +
                ", ancho=" + ancho +
                ", largo=" + largo +
                ", alto=" + alto +
                '}';
    }

    public void cantidadPersonas(){
        System.out.printf("En todo el edificio entran %d personas.\n",(numeroPisos * numeroOficinas * personasPorOficina));
        System.out.printf("En un piso caben %d personas.\n", (numeroOficinas * personasPorOficina));
    }
}
