package com.qoppa.medico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qoppa.medico.interfaces.IMedico;
import com.qoppa.medico.models.Medico;
import com.qoppa.medico.repositories.MedicoRepository;

@Service
public class MedicoService implements IMedico {

    @Autowired
    MedicoRepository medicoRepository;

    @Override
    public List findAll() {
        return medicoRepository.findAll();
    }

    @Override
    public Object findById(Long id) {
        return medicoRepository.findById(id);
    }

    @Override
    public Medico save(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public void deleteById(Long id) {
        medicoRepository.deleteById(id);

    }
}
