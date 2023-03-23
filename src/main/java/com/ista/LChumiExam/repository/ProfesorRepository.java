package com.ista.LChumiExam.repository;

import com.ista.LChumiExam.entity.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfesorRepository  extends MongoRepository<Profesor,Long> {
}
