package com.example.algamoney.api.event.listener;

import com.example.algamoney.api.event.RestricaoDePaginacaoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.persistence.TypedQuery;

@Component
public class RestricaoDePaginacaoListener implements ApplicationListener<RestricaoDePaginacaoEvent> {

    @Override
    public void onApplicationEvent(RestricaoDePaginacaoEvent restricaoDePaginacaoEvent) {
        TypedQuery<?> query = restricaoDePaginacaoEvent.getQuery();
        Pageable pageable = restricaoDePaginacaoEvent.getPageable();

        adicionarRestricoesDePaginacao(query, pageable);
    }

    private void adicionarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
        int paginaAtual = pageable.getPageNumber();
        int totalRegistrosPorPagina = pageable.getPageSize();
        int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;
        query.setFirstResult(primeiroRegistroDaPagina);
        query.setMaxResults(totalRegistrosPorPagina);
    }
}
