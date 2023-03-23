package com.ista.LChumiExam.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Carrera")
public class Carrera {

    private String nombre;
    private String descripcion;

    private List<Periodo> periodos;
}
