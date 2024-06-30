package com.scaler.product_service.controllers;


import com.scaler.product_service.models.Product;
import com.scaler.product_service.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
//

        return productService.getSingleProduct(id);
    }

    @GetMapping()
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }

//    public addProduct()
//    {
//
//    }
}
