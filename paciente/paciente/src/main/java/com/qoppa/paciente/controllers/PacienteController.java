package com.qoppa.paciente.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.qoppa.paciente.dtos.PacienteDTO;
import com.qoppa.paciente.models.Paciente;
import com.qoppa.paciente.services.PacienteService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @PostMapping
    public Paciente saveMedico(@RequestBody @Validated PacienteDTO pacienteDTO) {
        Paciente paciente = new Paciente();
        BeanUtils.copyProperties(pacienteDTO, paciente);
        pacienteService.save(paciente);
        return paciente;

    }

    @GetMapping
    public List<Paciente> findAll() {
        return pacienteService.findAll();
    }

    @GetMapping("/{id}")
    public Object findById(@PathVariable Long id) {
        return pacienteService.findById(id);
    }

    @PutMapping("/{id}")
    @Transactional
    @ResponseStatus(code = HttpStatus.OK)
    public Paciente update(@PathVariable Long id, @RequestBody Paciente paciente) {
        return pacienteService.save(paciente);
    }

    @DeleteMapping("/{id}")
    @Transactional
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        pacienteService.deleteById(id);
    }
}
