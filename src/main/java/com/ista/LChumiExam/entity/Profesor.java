package com.ista.LChumiExam.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Profesor")
public class Profesor {

    private Long id;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;

    private List<Asignatura> asignaturas;

    private List<Ciclo> ciclos;

}
