package com.nautica_centramar.Nautica.Centramar.nautica.centramar.service;

import com.nautica_centramar.Nautica.Centramar.nautica.centramar.model.Order;
import com.nautica_centramar.Nautica.Centramar.nautica.centramar.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    // Obtener todas las órdenes
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Obtener una orden por su ID
    public Optional<Order> getOrderById(String id) {
        return orderRepository.findById(id);
    }

    // Obtener todas las órdenes de un usuario
    public List<Order> getOrdersByUserId(String userId) {
        return orderRepository.findByUserId(userId);
    }

    // Guardar una nueva orden
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    // Actualizar una orden existente
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    // Eliminar una orden por su ID
    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }
}
