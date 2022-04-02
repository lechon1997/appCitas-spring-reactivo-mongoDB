package com.springBajo8.springBajo8.controllers;

import com.springBajo8.springBajo8.domain.Venta;
import com.springBajo8.springBajo8.domain.VolanteProveedor;
import com.springBajo8.springBajo8.service.IVolanteProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/volante-proveedor")
public class ControllerVolanteProveedor {
    @Autowired
    private IVolanteProveedorService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<VolanteProveedor> save(@RequestBody VolanteProveedor volanteProveedor) {
        int x = 3;
        return this.service.save(volanteProveedor);

    }

    @DeleteMapping("/{id}")
    private Mono<Void> delete(@PathVariable("id") String id) {
        return this.service.delete(id);
    }

    @PutMapping("/{id}")
    private Mono<VolanteProveedor> update(@PathVariable("id") String id, @RequestBody VolanteProveedor volanteProveedor) {
        return this.service.update(id, volanteProveedor);
    }

    @GetMapping
    private Flux<VolanteProveedor> findAll() {
        return this.service.findAll();
    }
}
