package com.tutorialesvip.tutorialunittest.util;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Component
public class DiferenciaEntreFechas {

    public Period calculateYearsOfIndependency(String independenceDay, String selectDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate today = selectDate != null ?
                LocalDate.parse(selectDate, formatter) :
                LocalDate.now();

        LocalDate localDate = LocalDate.parse(independenceDay, formatter);

        return Period.between(localDate, today);
    }
}