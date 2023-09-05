package com.rolando.Extras.Ex1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    //Alquiler se guarda:
    //        el nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
    //amarre y el barco que lo ocupará.
    private String name;
    private String document;
    private LocalDate startDate;
    private LocalDate returnDate;
    private MooringPosition mooringPosition;
    private Barco barco;

    public Alquiler(String name, String document, LocalDate startDate, LocalDate returnDate, MooringPosition mooringPosition, Barco barco) {
        this.name = name;
        this.document = document;
        this.startDate = startDate;
        this.returnDate = returnDate;
        this.mooringPosition = mooringPosition;
        this.barco = barco;
    }

    public int calculateRental(){
        int days = (int)startDate.until(returnDate, ChronoUnit.DAYS);
        if (days ==0) days = 1;
        return days * barco.calculateModule();
    }
}
