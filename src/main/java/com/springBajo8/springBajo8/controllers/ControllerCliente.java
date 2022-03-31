package com.springBajo8.springBajo8.controllers;

import com.springBajo8.springBajo8.domain.Cliente;
import com.springBajo8.springBajo8.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/cliente")
public class ControllerCliente {
    @Autowired
    private IClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Cliente> save(@RequestBody Cliente cliente) {
        return this.service.save(cliente);
    }

    @DeleteMapping("/{id}")
    private Mono<Cliente> delete(@PathVariable("id") String id) {
        return this.service.delete(id);

    }

    @PutMapping("/{id}")
    private Mono<Cliente> update(@PathVariable("id") String id, @RequestBody Cliente cliente) {
        return this.service.update(id, cliente);

    }

    @GetMapping
    private Flux<Cliente> findAll() {
        return this.service.findAll();
    }
}
