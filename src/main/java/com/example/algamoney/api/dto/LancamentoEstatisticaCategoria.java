package com.example.algamoney.api.dto;

import com.example.algamoney.api.model.Categoria;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class LancamentoEstatisticaCategoria {

    private Categoria categoria;
    private BigDecimal total;

    public LancamentoEstatisticaCategoria(Categoria categoria, BigDecimal total) {
        this.categoria = categoria;
        this.total = total;
    }
}
