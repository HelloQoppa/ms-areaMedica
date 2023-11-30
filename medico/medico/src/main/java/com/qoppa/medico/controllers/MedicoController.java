package com.qoppa.medico.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.qoppa.medico.dtos.MedicoDTO;
import com.qoppa.medico.models.Medico;
import com.qoppa.medico.services.MedicoService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/medico")
public class MedicoController {

    @Autowired
    MedicoService medicoService;

    @PostMapping
    public Medico saveMedico(@RequestBody @Valid MedicoDTO medicoDTO) {
        Medico medico = new Medico();
        BeanUtils.copyProperties(medicoDTO, medico);
        medicoService.save(medico);
        return medico;

    }

    @GetMapping
    public List<Medico> findAll() {
        return medicoService.findAll();
    }

    @GetMapping("/{id}")
    public Object findById(@PathVariable Long id) {
        return medicoService.findById(id);
    }

    @PutMapping("/{id}")
    @Transactional
    @ResponseStatus(code = HttpStatus.OK)
    public Medico update(@PathVariable Long id, @RequestBody Medico medico) {
        return medicoService.save(medico);
    }

    @DeleteMapping("/{id}")
    @Transactional
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        medicoService.deleteById(id);
    }
}
