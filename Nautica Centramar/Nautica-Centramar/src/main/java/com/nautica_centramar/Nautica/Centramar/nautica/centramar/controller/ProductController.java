package com.nautica_centramar.Nautica.Centramar.nautica.centramar.controller;

import com.nautica_centramar.Nautica.Centramar.nautica.centramar.model.Product;
import com.nautica_centramar.Nautica.Centramar.nautica.centramar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nuatica-centramar/products")
@CrossOrigin(origins = "http://localhost:3001")
public class ProductController {
    @Autowired
    private ProductService productService;
    //Obtener todos los productos
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    //Obtener un producto por su id
    @GetMapping("/{id}")
    public ResponseEntity<Product>getProductById(@PathVariable String id) {
        Optional<Product> product = productService.getProductById(id);
        return product.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }
    // Buscar productos por nombre
    @GetMapping("/serch")
    public List<Product>serchProductsByName(@RequestParam String name){
        return productService.searchProductsByName(name);
    }
    // Crear un nuevo producto
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    // Actualizar un producto existente
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable String id, @RequestBody Product product) {
        product.setId(id);
        return ResponseEntity.ok(productService.updateProduct(product));
    }

    // Eliminar un producto por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

}
