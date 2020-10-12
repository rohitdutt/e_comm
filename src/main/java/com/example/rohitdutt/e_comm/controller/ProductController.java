package com.example.rohitdutt.e_comm.controller;

import com.example.rohitdutt.e_comm.data.entity.Product;
import com.example.rohitdutt.e_comm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

        @Autowired
        private ProductRepository productRepository;

        @GetMapping("/product-all")
        public List<Product> getProducts(){
            return this.productRepository.findAll();
        }

        @GetMapping("product-id/{productId}")
        public Optional<Product> getProductById(@PathVariable String productId){
            return this.productRepository.findById(productId);
        }

        @PostMapping("product-create")
        public Product createProduct(@Valid @RequestBody Product product){
            return productRepository.save(product);
        }
}
