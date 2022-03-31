package com.springBajo8.springBajo8.repository;

import com.springBajo8.springBajo8.domain.Proveedor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IProveedorRepository extends ReactiveMongoRepository<Proveedor, String> {
}
