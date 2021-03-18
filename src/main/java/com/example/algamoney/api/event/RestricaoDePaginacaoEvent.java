package com.example.algamoney.api.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.data.domain.Pageable;

import javax.persistence.TypedQuery;

@Getter
public class RestricaoDePaginacaoEvent extends ApplicationEvent {

    private TypedQuery<?> query;
    private Pageable pageable;

    public RestricaoDePaginacaoEvent(Object source, TypedQuery<?> query, Pageable pageable) {
        super(source);
        this.query = query;
        this.pageable = pageable;
    }
}
