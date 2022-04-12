package com.dojo.prueba2.aplicacion.service;

import com.dojo.prueba2.dominio.model.Producto;
import com.dojo.prueba2.dominio.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProducto {
    @Autowired
    ProductoRepository productoRepository;

    public Producto save(Producto producto){
        return productoRepository.save(producto);
    }
}
