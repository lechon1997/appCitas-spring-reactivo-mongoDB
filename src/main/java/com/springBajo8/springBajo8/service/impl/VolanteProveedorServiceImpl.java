package com.springBajo8.springBajo8.service.impl;

import com.springBajo8.springBajo8.domain.VolanteProveedor;
import com.springBajo8.springBajo8.repository.IVolanteProveedorRepository;
import com.springBajo8.springBajo8.service.IVolanteProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class VolanteProveedorServiceImpl implements IVolanteProveedorService {

    @Autowired
    private IVolanteProveedorRepository repository;

    @Override
    public Mono<VolanteProveedor> save(VolanteProveedor volanteProveedor) {
        return repository.save(volanteProveedor);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono<VolanteProveedor> update(String id, VolanteProveedor volanteProveedor) {
        return repository.findById(id)
                .doOnNext(vp -> vp.setIdentificacionProveedor(id))
                .flatMap(repository::save);
    }

    @Override
    public Flux<VolanteProveedor> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<VolanteProveedor> findById(String id) {
        return repository.findById(id);
    }
}
