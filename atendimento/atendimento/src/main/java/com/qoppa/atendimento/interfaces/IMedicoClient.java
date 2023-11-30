package com.qoppa.atendimento.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.qoppa.atendimento.models.Medico;

@FeignClient(value = "medico", url = "http://localhost:8081")
public interface IMedicoClient {
    @GetMapping("/api/medico")
    List<Medico> getAllMedicos();

    @GetMapping("/api/medico/{id}")
    Medico getMedicoById(@PathVariable("id") Long id);

    @PostMapping("/api/medico")
    Medico createMedico(@RequestBody Medico medico);

    @PutMapping("/api/medico/{id}")
    Medico updateMedico(@PathVariable("id") Long id, @RequestBody Medico medico);

    @DeleteMapping("/api/medico/{id}")
    void deleteMedico(@PathVariable("id") Long id);

}
