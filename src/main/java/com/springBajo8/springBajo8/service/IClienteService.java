package com.springBajo8.springBajo8.service;

import com.springBajo8.springBajo8.domain.Cliente;
import com.springBajo8.springBajo8.domain.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClienteService {
    Mono<Cliente> save(Cliente Cliente);

    Mono<Cliente> delete(String id);

    Mono<Cliente> update(String id, Cliente cliente);

    Flux<Cliente> findAll();

    Mono<Cliente> findById(String id);
}
