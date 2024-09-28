package com.nautica_centramar.Nautica.Centramar.nautica.centramar.repository;

import com.nautica_centramar.Nautica.Centramar.nautica.centramar.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// La interfaz UserRepository extiende MongoRepository y te proporciona métodos CRUD
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Puedes agregar métodos personalizados de consulta si es necesario
    User findByUsername(String username); // Búsqueda de usuario por nombre de usuario
}