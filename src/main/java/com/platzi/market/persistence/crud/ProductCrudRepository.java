package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<ProductEntity, Long> {
    List<ProductEntity> findByCategoryIdOrderByNameAsc(long categoryId);
    Optional<List<ProductEntity>> findByStockQuantityLessThanAndStatus(int stockQuantity, boolean status);
}
