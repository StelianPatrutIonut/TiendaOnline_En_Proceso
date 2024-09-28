package com.nautica_centramar.Nautica.Centramar.nautica.centramar.service;

import com.nautica_centramar.Nautica.Centramar.nautica.centramar.model.User;
import com.nautica_centramar.Nautica.Centramar.nautica.centramar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Obtener un usuario por su ID
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    // Buscar usuario por nombre de usuario
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Guardar un nuevo usuario
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Actualizar un usuario existente
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Eliminar un usuario por su ID
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
