package com.springBajo8.springBajo8.controllers;

import com.springBajo8.springBajo8.domain.Factura;
import com.springBajo8.springBajo8.domain.Producto;
import com.springBajo8.springBajo8.service.IFacturaService;
import com.springBajo8.springBajo8.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/producto")
public class ControllerProducto {

    @Autowired
    private IProductoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Producto> save(@RequestBody Producto producto) {
        return this.service.save(producto);
    }

    @DeleteMapping("/{id}")
    private Mono<Producto> delete(@PathVariable("id") String id) {
        return this.service.delete(id);

    }

    @PutMapping("/{id}")
    private Mono<Producto> update(@PathVariable("id") String id, @RequestBody Producto producto) {
        return this.service.update(id, producto);
    }

    @GetMapping
    private Flux<Producto> findAll() {
        return this.service.findAll();
    }
}
