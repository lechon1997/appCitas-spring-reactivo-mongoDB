package com.springBajo8.springBajo8.service;

//import com.yoandypv.reactivestack.messages.domain.Message;
import com.springBajo8.springBajo8.domain.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IFacturaService {
    Mono<Factura> save(Factura factura);

    Mono<Factura> delete(String id);

    Mono<Factura> update(String id, Factura factura);

    Flux<Factura> findAll();

    Mono<Factura> findById(String id);
}
