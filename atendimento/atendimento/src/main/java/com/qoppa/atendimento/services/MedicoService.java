package com.qoppa.atendimento.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qoppa.atendimento.interfaces.IMedicoClient;
import com.qoppa.atendimento.models.Medico;

@Service
public class MedicoService implements IMedicoClient {

    final IMedicoClient medicoClient;

    MedicoService(IMedicoClient medicoClient) {
        this.medicoClient = medicoClient;
    }

    @Override
    public List<Medico> getAllMedicos() {
        return medicoClient.getAllMedicos();
    }

    @Override
    public Medico getMedicoById(Long id) {
        return medicoClient.getMedicoById(id);
    }

    @Override
    public Medico createMedico(Medico medico) {
        return medicoClient.createMedico(medico);

    }

    @Override
    public Medico updateMedico(Long id, Medico medico) {
        return medicoClient.updateMedico(id, medico);

    }

    @Override
    public void deleteMedico(Long id) {
        medicoClient.deleteMedico(id);
    }

}
