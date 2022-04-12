package com.dojo.prueba2.dominio.repository;

import com.dojo.prueba2.dominio.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, String> {
}
