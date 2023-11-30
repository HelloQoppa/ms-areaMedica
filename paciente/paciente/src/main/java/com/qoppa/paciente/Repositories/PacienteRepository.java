package com.qoppa.paciente.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qoppa.paciente.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
