package com.springBajo8.springBajo8.controllers;

import com.springBajo8.springBajo8.domain.Cliente;
import com.springBajo8.springBajo8.domain.Proveedor;
import com.springBajo8.springBajo8.service.IClienteService;
import com.springBajo8.springBajo8.service.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/proveedor")
public class ControllerProveedor {
    @Autowired
    private IProveedorService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Proveedor> save(@RequestBody Proveedor proveedor) {
        return this.service.save(proveedor);
    }

    @DeleteMapping("/{id}")
    private Mono<Void> delete(@PathVariable("id") String id) {
        return this.service.delete(id);

    }

    @PutMapping("/{id}")
    private Mono<Proveedor> update(@PathVariable("id") String id, @RequestBody Proveedor proveedor) {
        return this.service.update(id, proveedor);

    }

    @GetMapping
    private Flux<Proveedor> findAll() {
        return this.service.findAll();
    }
}
