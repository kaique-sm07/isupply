package com.hackaton.isuply.controller;

import com.hackaton.isuply.dto.RestaurantDto;
import com.hackaton.isuply.model.Purveyor;
import com.hackaton.isuply.service.PurveyorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/purveyor")
public class PurveyorController {

    @Autowired
    private PurveyorService purveyorService;

    @GetMapping("/getAll")
    /** Lista todos os fornecedores cadastrados */
    public List<Purveyor> getAllRestaurants() {
        return purveyorService.getAll();
    }


    @GetMapping("/getById/{id}")
    /** Busca um fornecedor pelo id */
    public Purveyor getById(@PathVariable(value = "id") Long id) {
        return purveyorService.getById(id);
    }

    @PostMapping("/create/{purveyor}")
    /** Cria um restaurante a partir dos dados enviaods pela api */
    public Purveyor createPurveyor(@Valid @RequestBody RestaurantDto purveyorDto) {

        Purveyor purveyor = new Purveyor();
        purveyor.setEmail(purveyorDto.getEmail());
        purveyor.setLat(new BigDecimal(purveyorDto.getLat()));
        purveyor.setLon(new BigDecimal(purveyorDto.getLon()));
        purveyor.setName(purveyorDto.getName());
        purveyor.setSite(purveyorDto.getSite());
        return purveyorService.insert(purveyor);
    }


    @PutMapping("/update/{id}")
    /** Atualiza as inforacoes de um determinado fornecedor */
    public Purveyor updatePurveyor(@PathVariable(value = "id") Long id,
                                   @Valid @RequestBody RestaurantDto purveyorDto) {

        Purveyor purveyor = purveyorService.getById(id);
        purveyor.setEmail(purveyorDto.getEmail());
        purveyor.setLat(new BigDecimal(purveyorDto.getLat()));
        purveyor.setLon(new BigDecimal(purveyorDto.getLon()));
        purveyor.setName(purveyorDto.getName());
        purveyor.setSite(purveyorDto.getSite());
        return purveyorService.insert(purveyor);
    }
}
