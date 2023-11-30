package com.qoppa.atendimento.controllers;

import java.util.List;

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

import com.qoppa.atendimento.models.Paciente;
import com.qoppa.atendimento.services.PacienteService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @GetMapping()
    public List<Paciente> getAllPacientes() {
        return pacienteService.getAllPacientes();
    }

    @GetMapping("/{id}")
    public Object getPacienteById(@PathVariable Long id) {
        return pacienteService.getPacienteById(id);
    }

    @DeleteMapping("/{id}")
    @Transactional
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteMedico(@PathVariable Long id) {
        pacienteService.deletePaciente(id);
    }

    @PutMapping("/{id}")
    public Paciente updateMedico(@PathVariable("id") Long id, @RequestBody Paciente paciente) {
        return pacienteService.updatePaciente(id, paciente);
    }

    @PostMapping
    public Paciente createPaciente(@RequestBody Paciente paciente) {
        return pacienteService.createPaciente(paciente);
    }

}
