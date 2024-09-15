package com.code_generator.demo_code_generaror.repository;


import com.code_generator.demo_code_generaror.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    List<ProductEntity> findAll();
}
