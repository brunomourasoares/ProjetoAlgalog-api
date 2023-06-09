package com.algaworks.algalog.api.model.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaInput {
    @NotNull
    private BigDecimal taxa;

    @Valid
    @NotNull
    private ClienteIdInput cliente;
    @Valid
    @NotNull
    private DestinationInput destinatario;
}
