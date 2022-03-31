package com.springBajo8.springBajo8.service;

import com.springBajo8.springBajo8.domain.Proveedor;
import com.springBajo8.springBajo8.domain.Venta;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IVentaService {
    Mono<Venta> save(Venta venta);

    Mono<Void> delete(String id);

    Mono<Venta> update(String id, Venta venta);

    Flux<Venta> findAll();

    Mono<Venta> findById(String id);
}
