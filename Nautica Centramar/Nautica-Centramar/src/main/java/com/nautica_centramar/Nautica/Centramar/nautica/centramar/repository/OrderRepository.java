package com.nautica_centramar.Nautica.Centramar.nautica.centramar.repository;


import com.nautica_centramar.Nautica.Centramar.nautica.centramar.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// La interfaz OrderRepository extiende MongoRepository y te proporciona métodos CRUD
@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    // Puedes agregar métodos personalizados de consulta si es necesario
    List<Order> findByUserId(String userId); // Búsqueda de pedidos por ID de usuario
}
