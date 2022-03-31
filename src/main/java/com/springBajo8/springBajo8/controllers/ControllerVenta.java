package com.springBajo8.springBajo8.controllers;

import com.springBajo8.springBajo8.domain.Proveedor;
import com.springBajo8.springBajo8.domain.Venta;
import com.springBajo8.springBajo8.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/venta")
public class ControllerVenta {

    @Autowired
    private IVentaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Venta> save(@RequestBody Venta venta) {
        return this.service.save(venta);
    }

    @DeleteMapping("/{id}")
    private Mono<Void> delete(@PathVariable("id") String id) {
        return this.service.delete(id);
    }

    @PutMapping("/{id}")
    private Mono<Venta> update(@PathVariable("id") String id, @RequestBody Venta venta) {
        return this.service.update(id, venta);

    }

    @GetMapping
    private Flux<Venta> findAll() {
        return this.service.findAll();
    }


}
