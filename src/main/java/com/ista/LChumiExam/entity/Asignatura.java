package com.ista.LChumiExam.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Asignatura")
public class Asignatura {

    private String nombre;
    private Long n_horas;
    private Long n_horas_practicas;
    private Long n_horas_autonomas;

}
