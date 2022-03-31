package com.springBajo8.springBajo8.repository;

import com.springBajo8.springBajo8.domain.Venta;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IVentaRepository extends ReactiveMongoRepository<Venta, String> {
}
