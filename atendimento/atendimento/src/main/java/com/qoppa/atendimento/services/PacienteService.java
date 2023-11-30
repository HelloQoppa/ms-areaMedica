package com.qoppa.atendimento.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qoppa.atendimento.interfaces.IPacienteClient;
import com.qoppa.atendimento.models.Paciente;

@Service
public class PacienteService implements IPacienteClient {

    final IPacienteClient iPacienteClient;

    PacienteService(IPacienteClient iPacienteClient) {
        this.iPacienteClient = iPacienteClient;
    }

    @Override
    public List<Paciente> getAllPacientes() {
        return iPacienteClient.getAllPacientes();
    }

    @Override
    public Paciente getPacienteById(Long id) {
        return iPacienteClient.getPacienteById(id);

    }

    @Override
    public Paciente createPaciente(Paciente paciente) {
        return iPacienteClient.createPaciente(paciente);
    }

    @Override
    public Paciente updatePaciente(Long id, Paciente paciente) {
        return iPacienteClient.updatePaciente(id, paciente);
    }

    @Override
    public void deletePaciente(Long id) {
        iPacienteClient.deletePaciente(id);
    }
}
