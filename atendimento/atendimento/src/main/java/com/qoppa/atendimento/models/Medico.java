package com.qoppa.atendimento.models;

public record Medico(

        Long id,
        String nome,
        String especialidade,
        String crm,
        String situacao) {

}
