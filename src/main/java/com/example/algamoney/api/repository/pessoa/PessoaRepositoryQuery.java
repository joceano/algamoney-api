package com.example.algamoney.api.repository.pessoa;

import com.example.algamoney.api.model.Pessoa;
import com.example.algamoney.api.repository.filter.PessoaFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PessoaRepositoryQuery {

    public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);
}
