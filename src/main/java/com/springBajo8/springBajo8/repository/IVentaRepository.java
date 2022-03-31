package com.springBajo8.springBajo8.repository;

import com.springBajo8.springBajo8.domain.Venta;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends ReactiveMongoRepository<Venta, String> {
}
