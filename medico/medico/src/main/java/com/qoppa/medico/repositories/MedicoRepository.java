package com.qoppa.medico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qoppa.medico.models.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
