package com.springBajo8.springBajo8.service.impl;

import com.springBajo8.springBajo8.domain.Venta;
import com.springBajo8.springBajo8.repository.IVentaRepository;
import com.springBajo8.springBajo8.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VentaServiceImpl implements IVentaService {

    @Autowired
    private IVentaRepository repository;

    @Override
    public Mono<Venta> save(Venta venta) {
        return repository.save(venta);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono<Venta> update(String id, Venta venta) {
        return repository.findById(id)
                .doOnNext(v-> v.setId(id))
                .flatMap(repository::save);
    }

    @Override
    public Flux<Venta> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Venta> findById(String id) {
        return repository.findById(id);
    }
}
