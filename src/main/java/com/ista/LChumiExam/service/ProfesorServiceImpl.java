package com.ista.LChumiExam.service;

import com.ista.LChumiExam.entity.Profesor;
import com.ista.LChumiExam.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor,Long> implements ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;


    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return profesorRepository;
    }
}
