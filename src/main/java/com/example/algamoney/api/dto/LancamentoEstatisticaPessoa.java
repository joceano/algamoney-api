package com.example.algamoney.api.dto;

import com.example.algamoney.api.model.Pessoa;
import com.example.algamoney.api.model.TipoLancamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class LancamentoEstatisticaPessoa {

    private TipoLancamento tipo;
    private Pessoa pessoa;
    private BigDecimal total;
}
