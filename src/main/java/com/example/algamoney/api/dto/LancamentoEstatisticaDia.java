package com.example.algamoney.api.dto;

import com.example.algamoney.api.model.TipoLancamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class LancamentoEstatisticaDia {

    private TipoLancamento tipo;
    private LocalDate dia;
    private BigDecimal total;
}
