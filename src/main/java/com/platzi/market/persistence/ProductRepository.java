package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.persistence.entity.Product;

import java.util.List;
import java.util.Optional;

public class ProductRepository {

    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(long categoryId) {
        return productCrudRepository.findByCategoryIdOrderByNameAsc(categoryId);
    }

    public Optional<List<Product>> getScarce(int stockQuantity) {
        return productCrudRepository.findByStockQuantityLessThanAndStatus( stockQuantity, true);
    }

}
