package com.qoppa.medico.dtos;

import com.qoppa.medico.enuns.SituacaoEnun;

import jakarta.validation.constraints.NotBlank;

public record MedicoDTO(

        @NotBlank String nome,
        @NotBlank String especialidade,
        @NotBlank String crm,
        SituacaoEnun situacao

) {

}
