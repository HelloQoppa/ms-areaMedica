package com.qoppa.paciente.dtos;

import com.qoppa.paciente.Enuns.SituacaoEnun;

public record PacienteDTO(
        String matricula,
        String nome,
        SituacaoEnun situacao) {

}
