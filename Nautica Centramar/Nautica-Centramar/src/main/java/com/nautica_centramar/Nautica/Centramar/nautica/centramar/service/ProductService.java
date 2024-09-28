package com.nautica_centramar.Nautica.Centramar.nautica.centramar.service;

import com.nautica_centramar.Nautica.Centramar.nautica.centramar.model.Product;
import com.nautica_centramar.Nautica.Centramar.nautica.centramar.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Obtener todos los productos
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    //Obtener un producto por su id
    public Optional<Product>getProductById(String id){
        return productRepository.findById(id);
    }
    // Buscar productos por nombre
    public List<Product> searchProductsByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    // Guardar un nuevo producto
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Actualizar un producto existente
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    // Eliminar un producto por su ID
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

}
