package com.tutorialesvip.tutorialunittest.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DiferenciaEntreFechasTest {

    @Autowired
    DiferenciaEntreFechas diferenciaEntreFechas;

    @Test
    void calculateYearsOfIndependency() {
        diferenciaEntreFechas = new DiferenciaEntreFechas();
        String fechaIndependencia = "27/02/1844";

        Period resultado = diferenciaEntreFechas.calculateYearsOfIndependency(fechaIndependencia, "28/08/2022");

        Assertions.assertEquals(6,resultado.getMonths() );
        Assertions.assertEquals(1,resultado.getDays() );
        Assertions.assertEquals(178,resultado.getYears() );

        Period resultadoNull = diferenciaEntreFechas.calculateYearsOfIndependency(fechaIndependencia, null);

        Assertions.assertEquals(6,resultado.getMonths() );
        Assertions.assertEquals(1,resultado.getDays() );
        Assertions.assertEquals(178,resultado.getYears() );


    }

}