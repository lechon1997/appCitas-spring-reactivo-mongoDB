package com.springBajo8.springBajo8.service;

import com.springBajo8.springBajo8.domain.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductoService {
    Mono<Producto> save(Producto producto);

    Mono<Producto> delete(String id);

    Mono<Producto> update(String id, Producto producto);

    Flux<Producto> findAll();

    Mono<Producto> findById(String id);
}
