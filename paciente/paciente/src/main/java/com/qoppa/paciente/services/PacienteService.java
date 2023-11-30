package com.qoppa.paciente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qoppa.paciente.Interfaces.IPaciente;
import com.qoppa.paciente.Repositories.PacienteRepository;
import com.qoppa.paciente.models.Paciente;

@Service
public class PacienteService implements IPaciente {

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public List findAll() {
        return pacienteRepository.findAll();
    }

    @Override
    public Object findById(Long id) {
        return pacienteRepository.findById(id).get();
    }

    @Override
    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public void deleteById(Long id) {
        pacienteRepository.deleteById(id);
    }
}
