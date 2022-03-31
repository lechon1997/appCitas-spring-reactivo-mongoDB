package com.springBajo8.springBajo8.service.impl;

import com.springBajo8.springBajo8.domain.Producto;
import com.springBajo8.springBajo8.repository.IProductoRepository;
import com.springBajo8.springBajo8.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository repository;

    @Override
    public Mono<Producto> save(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public Mono<Producto> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(p -> this.repository.deleteById(p.getId()).thenReturn(p));
    }

    @Override
    public Mono<Producto> update(String id, Producto producto) {
        return this.repository.findById(id)
                .doOnNext(p -> p.setId(id))
                .flatMap(repository::save);
    }

    @Override
    public Flux<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Producto> findById(String id) {
        return repository.findById(id);
    }
}
