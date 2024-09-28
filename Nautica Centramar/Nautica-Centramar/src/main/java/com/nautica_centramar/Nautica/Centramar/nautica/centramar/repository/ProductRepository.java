package com.nautica_centramar.Nautica.Centramar.nautica.centramar.repository;

import com.nautica_centramar.Nautica.Centramar.nautica.centramar.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository// La interfaz ProductRepository extiende MongoRepository y te proporciona métodos CRUD
public interface ProductRepository extends MongoRepository<Product,String> {
    // Puedes agregar métodos personalizados de consulta si es necesario
    List<Product> findByNameContainingIgnoreCase(String name); // Búsqueda de productos por nombre (no sensible a mayúsculas)
}
