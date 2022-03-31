package com.springBajo8.springBajo8.controllers;


import com.springBajo8.springBajo8.domain.Factura;
import com.springBajo8.springBajo8.service.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/factura")
public class ControllerFactura {

    @Autowired
    private IFacturaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Factura> save(@RequestBody Factura factura) {
        return this.service.save(factura);
    }

    @DeleteMapping("/{id}")
    private Mono<Factura> delete(@PathVariable("id") String id) {
        return this.service.delete(id);

    }

    @PutMapping("/{id}")
    private Mono<Factura> update(@PathVariable("id") String id, @RequestBody Factura citasDTOReactiva) {
        return this.service.update(id, citasDTOReactiva);
    }

    @GetMapping
    private Flux<Factura> findAll() {
        return this.service.findAll();
    }

}
