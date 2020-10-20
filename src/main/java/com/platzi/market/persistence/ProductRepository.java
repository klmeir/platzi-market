package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.persistence.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private ProductCrudRepository productCrudRepository;

    public List<ProductEntity> getAll() {
        return (List<ProductEntity>) productCrudRepository.findAll();
    }

    public List<ProductEntity> getByCategory(long categoryId) {
        return productCrudRepository.findByCategoryIdOrderByNameAsc(categoryId);
    }

    public Optional<List<ProductEntity>> getScarce(int stockQuantity) {
        return productCrudRepository.findByStockQuantityLessThanAndStatus( stockQuantity, true);
    }

    public Optional<ProductEntity> getProduct(long productId) {
        return productCrudRepository.findById(productId);
    }

    public ProductEntity save(ProductEntity product) {
        return productCrudRepository.save(product);
    }

    public void delete(long productId) {
        productCrudRepository.deleteById(productId);
    }

}
