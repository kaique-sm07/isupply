package com.hackaton.isuply.service;

import com.hackaton.isuply.dao.PurveyorDao;
import com.hackaton.isuply.model.Purveyor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PurveyorService {

    @Autowired
    private PurveyorDao purveyorDao;

    /** Busca fornecedor por id */
    public Purveyor getById(Long idPurvoyor) {
        return purveyorDao.getById(idPurvoyor);
    }

    /** Insere um fornecedor */
    public Purveyor insert(Purveyor purveyor) {
        return purveyorDao.insert(purveyor);
    }

    /** Busca todos os fornecedor */
    public List<Purveyor> getAll() {
        return purveyorDao.getAll();
    }
}
