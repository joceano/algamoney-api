package com.example.algamoney.api.dto;

import com.example.algamoney.api.model.TipoLancamento;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class LancamentoEstatisticaDia {

    private TipoLancamento tipo;
    private LocalDate dia;
    private BigDecimal total;

    public LancamentoEstatisticaDia(TipoLancamento tipo, LocalDate dia, BigDecimal total) {
        this.tipo = tipo;
        this.dia = dia;
        this.total = total;
    }
}
