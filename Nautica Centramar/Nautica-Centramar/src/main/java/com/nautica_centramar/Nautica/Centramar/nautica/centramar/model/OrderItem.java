package com.nautica_centramar.Nautica.Centramar.nautica.centramar.model;

public class OrderItem {
    private String productId;
    private int quantity;
    private double price;

    // Constructor por defecto
    public OrderItem() {}

    // Constructor con parámetros
    public OrderItem(String productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters y Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
