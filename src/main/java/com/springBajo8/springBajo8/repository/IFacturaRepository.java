package com.springBajo8.springBajo8.repository;

//import com.yoandypv.reactivestack.messages.domain.Message;
import com.springBajo8.springBajo8.domain.Factura;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IFacturaRepository extends ReactiveMongoRepository<Factura, String> {
}
