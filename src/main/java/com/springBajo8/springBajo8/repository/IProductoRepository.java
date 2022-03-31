package com.springBajo8.springBajo8.repository;

import com.springBajo8.springBajo8.domain.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface IProductoRepository extends ReactiveMongoRepository<Producto,String> {
}
