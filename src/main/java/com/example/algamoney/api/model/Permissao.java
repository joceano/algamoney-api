package com.example.algamoney.api.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode(of = "codigo")
@Data
@Entity
@Table(name = "permissao")
public class Permissao {

    @Id
    private Long codigo;
    private String descricao;
}
