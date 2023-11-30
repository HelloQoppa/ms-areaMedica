package com.qoppa.paciente.Interfaces;

import java.util.List;

import com.qoppa.paciente.models.Paciente;

public interface IPaciente<T> {

    public List<T> findAll();

    public T findById(Long id);

    public T save(Paciente paciente);

    public void deleteById(Long id);
}
