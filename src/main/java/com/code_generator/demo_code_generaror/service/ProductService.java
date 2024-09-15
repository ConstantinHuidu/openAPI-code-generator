package com.code_generator.demo_code_generaror.service;

import com.code_generator.demo_code_generaror.backend.server.dto.Product;


import com.code_generator.demo_code_generaror.mapper.ProductMapper;
import com.code_generator.demo_code_generaror.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;

    }

    public List<Product> getAllVideos(){
        var products = this.productRepository.findAll();


        return this.productMapper.toDto(products);
    }
}
