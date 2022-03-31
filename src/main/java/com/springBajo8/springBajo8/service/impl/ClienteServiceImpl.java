package com.springBajo8.springBajo8.service.impl;

import com.springBajo8.springBajo8.domain.Cliente;
import com.springBajo8.springBajo8.domain.Factura;
import com.springBajo8.springBajo8.repository.IClienteRepository;
import com.springBajo8.springBajo8.service.IClienteService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ClienteServiceImpl implements IClienteService {

    private IClienteRepository repository;

    @Override
    public Mono<Cliente> save(Cliente Cliente) {
        return this.repository.save(Cliente);
    }

    @Override
    public Mono<Cliente> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(p -> this.repository.deleteById(p.getDocumentoIdentificacion()).thenReturn(p));
    }

    @Override
    public Mono<Cliente> update(String id, Cliente cliente) {
        return this.repository.findById(id)
                .flatMap(citasDTOReactiva1 -> {
                    cliente.setDocumentoIdentificacion(id);
                    return save(cliente);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Flux<Cliente> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Cliente> findById(String id) {
        return repository.findById(id);
    }
}
