package com.springBajo8.springBajo8.controller;


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
public class citasReactivaResource {

    @Autowired
    private IFacturaService IFacturaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Factura> save(@RequestBody Factura factura) {
        return this.IFacturaService.save(factura);
    }

    @DeleteMapping("/{id}")
    private Mono<ResponseEntity<Factura>> delete(@PathVariable("id") String id) {
        return this.IFacturaService.delete(id)
                .flatMap(citasDTOReactiva -> Mono.just(ResponseEntity.ok(citasDTOReactiva)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));

    }

    @PutMapping("/{id}")
    private Mono<ResponseEntity<Factura>> update(@PathVariable("id") String id, @RequestBody Factura citasDTOReactiva) {
        return this.IFacturaService.update(id, citasDTOReactiva)
                .flatMap(citasDTOReactiva1 -> Mono.just(ResponseEntity.ok(citasDTOReactiva1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping
    private Flux<Factura> findAll() {
        return this.IFacturaService.findAll();
    }

}
