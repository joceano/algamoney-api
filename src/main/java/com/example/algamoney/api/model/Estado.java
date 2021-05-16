package com.example.algamoney.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@EqualsAndHashCode(of = "codigo")
@Getter
@Setter
@Entity
@Table(name = "estado")
public class Estado {

    @Id
    private Long codigo;

    private String nome;
}
