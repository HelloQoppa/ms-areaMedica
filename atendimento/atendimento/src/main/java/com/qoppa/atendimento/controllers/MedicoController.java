package com.qoppa.atendimento.controllers;

import java.util.List;

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

import com.qoppa.atendimento.models.Medico;
import com.qoppa.atendimento.services.MedicoService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/app")
public class MedicoController {
    final MedicoService medicoService;

    MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping()
    public List<Medico> getAllMedicos() {
        return medicoService.getAllMedicos();
    }

    @GetMapping("/{id}")
    public Object getMedicoById(@PathVariable Long id) {
        return medicoService.getMedicoById(id);
    }

    @DeleteMapping("/{id}")
    @Transactional
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteMedico(@PathVariable Long id) {
        medicoService.deleteMedico(id);
    }

    @PutMapping("/{id}")
    public Medico updateMedico(@PathVariable("id") Long id, @RequestBody Medico medico) {
        return medicoService.createMedico(medico);
    }

    @PostMapping
    public Medico createMedico(@RequestBody Medico medico) {
        return medicoService.createMedico(medico);
    }

}
