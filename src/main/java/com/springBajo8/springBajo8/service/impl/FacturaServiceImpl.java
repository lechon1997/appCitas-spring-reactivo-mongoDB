package com.springBajo8.springBajo8.service.impl;

//import com.yoandypv.reactivestack.messages.domain.Message;
//import com.yoandypv.reactivestack.messages.repository.MessageRepository;
//import com.yoandypv.reactivestack.messages.service.MessageService;
import com.springBajo8.springBajo8.domain.Factura;
import com.springBajo8.springBajo8.repository.IFacturaRepository;
import com.springBajo8.springBajo8.service.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FacturaServiceImpl implements IFacturaService {

    @Autowired
    private IFacturaRepository IFacturaRepository;

    @Override
    public Mono<Factura> save(Factura citasDTOReactiva) {
        return this.IFacturaRepository.save(citasDTOReactiva);
    }

    @Override
    public Mono<Factura> delete(String id) {
        return this.IFacturaRepository
                .findById(id)
                .flatMap(p -> this.IFacturaRepository.deleteById(p.getId()).thenReturn(p));

    }

    @Override
    public Mono<Factura> update(String id, Factura citasDTOReactiva) {
        return this.IFacturaRepository.findById(id)
                .flatMap(citasDTOReactiva1 -> {
                    citasDTOReactiva.setId(id);
                    return save(citasDTOReactiva);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Flux<Factura> findAll() {
        return this.IFacturaRepository.findAll();
    }

    @Override
    public Mono<Factura> findById(String id) {
        return this.IFacturaRepository.findById(id);
    }
}
