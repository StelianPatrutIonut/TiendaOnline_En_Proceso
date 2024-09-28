package com.nautica_centramar.Nautica.Centramar.nautica.centramar.controller;


import com.nautica_centramar.Nautica.Centramar.nautica.centramar.model.Order;
import com.nautica_centramar.Nautica.Centramar.nautica.centramar.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nautica-centramar/orders")
@CrossOrigin(origins = "http://localhost:3001")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Obtener todas las órdenes
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Obtener una orden por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable String id) {
        Optional<Order> order = orderService.getOrderById(id);
        return order.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Crear una nueva orden
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    // Actualizar una orden existente
    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable String id, @RequestBody Order order) {
        order.setId(id);
        return ResponseEntity.ok(orderService.updateOrder(order));
    }

    // Eliminar una orden por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable String id) {
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }
}