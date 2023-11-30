package com.qoppa.atendimento.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.qoppa.atendimento.models.Paciente;


@FeignClient(value = "paciente", url = "http://localhost:8080")
public interface IPacienteClient {

    @GetMapping("/api/paciente")
    List<Paciente> getAllPacientes();

    @GetMapping("/api/paciente/{id}")
    Paciente getPacienteById(@PathVariable("id") Long id);

    @PostMapping("/api/paciente")
    Paciente createPaciente(@RequestBody Paciente paciente);

    @PutMapping("/api/paciente/{id}")
    Paciente updatePaciente(@PathVariable("id") Long id, @RequestBody Paciente paciente);

    @DeleteMapping("/api/paciente/{id}")
    void deletePaciente(@PathVariable("id") Long id);

}
