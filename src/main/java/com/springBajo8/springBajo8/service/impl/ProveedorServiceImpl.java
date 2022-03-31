package com.springBajo8.springBajo8.service.impl;

import com.springBajo8.springBajo8.domain.Proveedor;
import com.springBajo8.springBajo8.repository.IProveedorRepository;
import com.springBajo8.springBajo8.service.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProveedorServiceImpl implements IProveedorService {

    @Autowired
    private IProveedorRepository repository;

    @Override
    public Mono<Proveedor> save(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono<Proveedor> update(String id, Proveedor proveedor) {
        return repository.findById(id).
                doOnNext(p -> p.setIdentifiacionProveedor(id))
                .flatMap(repository::save);
    }

    @Override
    public Flux<Proveedor> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Proveedor> findById(String id) {
        return repository.findById(id);
    }
}
