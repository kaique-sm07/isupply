package com.hackaton.isuply.dao;

import com.hackaton.isuply.exception.ResourceNotFoundException;
import com.hackaton.isuply.model.Purveyor;
import com.hackaton.isuply.repository.PurveyorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PurveyorDao {

    @Autowired
    private PurveyorRepository purveyorRepository;

    /** Busca um fornecedor pelo id */
    public Purveyor getById(Long id) {
        return purveyorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Purveyor", "id", id));
    }

    /** Insere um fornecedor */
    public Purveyor insert(Purveyor purveyor) {
        return purveyorRepository.save(purveyor);
    }

    /** Busca todos os fornecedores */
    public List<Purveyor> getAll() {
        return purveyorRepository.findAll();
    }
}
