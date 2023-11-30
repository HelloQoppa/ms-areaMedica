package com.qoppa.medico.interfaces;

import java.util.List;

import com.qoppa.medico.models.Medico;

public interface IMedico<T> {

    public List<T> findAll();

    public T findById(Long id);

    public T save(Medico medico);

    public void deleteById(Long id);
}
