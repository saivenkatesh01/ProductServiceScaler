package com.scaler.product_service.services;

import com.scaler.product_service.models.Product;
import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long ProductId);
    List<Product> getAllProducts();
}
