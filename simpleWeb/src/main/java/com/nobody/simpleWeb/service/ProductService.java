package com.nobody.simpleWeb.service;

import com.nobody.simpleWeb.model.Product;
import com.nobody.simpleWeb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Mouse", 29999),
//            new Product(102, "Pen Drive", 12999),
//            new Product(103, "Ram", 40000))
//    );

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int productId) {
        return productRepository.findById(productId).orElse(new Product());
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }
}
