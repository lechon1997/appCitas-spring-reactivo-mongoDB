package com.springBajo8.springBajo8.repository;

import com.springBajo8.springBajo8.domain.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IClienteRepository extends ReactiveMongoRepository<Cliente, String> {
}
