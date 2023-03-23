package com.ista.LChumiExam.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Periodo")
public class Periodo {

    private String periodo;
    private Long year;
}
