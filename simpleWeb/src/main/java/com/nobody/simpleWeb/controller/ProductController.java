package com.nobody.simpleWeb.controller;

import com.nobody.simpleWeb.model.Product;
import com.nobody.simpleWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "New product added successfully";
    }

    @PutMapping("/products")
    public String updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        return "Product updated successfully";
    }

    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable int productId) {
        productService.deleteProduct(productId);
        return "Product deleted successfully";
    }
}
