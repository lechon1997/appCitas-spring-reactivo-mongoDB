package com.springBajo8.springBajo8.service;

import com.springBajo8.springBajo8.domain.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IHistorialService {
    Mono<> save(Factura factura);

    Mono<Factura> delete(String id);

    Mono<Factura> update(String id, Factura factura);

    Flux<Factura> findAll();

    Mono<Factura> findById(String id);
}
