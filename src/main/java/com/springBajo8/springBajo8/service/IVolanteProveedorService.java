package com.springBajo8.springBajo8.service;

import com.springBajo8.springBajo8.domain.Venta;
import com.springBajo8.springBajo8.domain.VolanteProveedor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IVolanteProveedorService {
    Mono<VolanteProveedor> save(VolanteProveedor volanteProveedor);

    Mono<Void> delete(String id);

    Mono<VolanteProveedor> update(String id, VolanteProveedor volanteProveedor);

    Flux<VolanteProveedor> findAll();

    Mono<VolanteProveedor> findById(String id);
}
