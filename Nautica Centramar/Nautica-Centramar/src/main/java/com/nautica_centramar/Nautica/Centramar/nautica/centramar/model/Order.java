package com.nautica_centramar.Nautica.Centramar.nautica.centramar.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "orders") // Nombre de la colección en MongoDB
public class Order {
    @Id // Identificador único del pedido
    private String id;
    private String userId;
    private Date orderDate;
    private List<OrderItem> items;
    private double totalAmount;
    private String status; // Ejemplo: "PENDING", "SHIPPED", "DELIVERED"

    // Constructor por defecto
    public Order() {}

    // Constructor con parámetros
    public Order(String userId, Date orderDate, List<OrderItem> items, double totalAmount, String status) {
        this.userId = userId;
        this.orderDate = orderDate;
        this.items = items;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
