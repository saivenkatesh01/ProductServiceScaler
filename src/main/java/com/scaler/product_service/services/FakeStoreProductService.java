package com.scaler.product_service.services;

import com.scaler.product_service.dtos.FakeStoreProductDto;
import com.scaler.product_service.models.Category;
import com.scaler.product_service.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate=restTemplate;
    }
    @Override
    public Product getSingleProduct(Long productId) {
        //call fakestore productservice to fetch the Product with given id via http call.
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/1" + productId,
                FakeStoreProductDto.class
        );
        // convert FakeStoreProductDto to Product

        return convertFakeStoreProductToProduct(fakeStoreProductDto);
    }

    @Override
    public List<Product> getAllProducts() {

        return List.of();
    }
    private Product convertFakeStoreProductToProduct(FakeStoreProductDto fakeStoreProductDto) {
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());

        Category category = new Category();
        category.setDescription(fakeStoreProductDto.getDescription());
        product.setCategory(category);
        return product;
    }
}
