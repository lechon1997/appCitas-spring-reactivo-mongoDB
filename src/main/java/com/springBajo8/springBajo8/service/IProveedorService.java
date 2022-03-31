package com.springBajo8.springBajo8.service;

import com.springBajo8.springBajo8.domain.Cliente;
import com.springBajo8.springBajo8.domain.Proveedor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProveedorService {
    Mono<Proveedor> save(Proveedor proveedor);

    Mono<Void> delete(String id);

    Mono<Proveedor> update(String id, Proveedor proveedor);

    Flux<Proveedor> findAll();

    Mono<Proveedor> findById(String id);
}
