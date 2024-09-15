package com.code_generator.demo_code_generaror.delegate;

import com.code_generator.demo_code_generaror.backend.server.api.ProductsApiDelegate;
import com.code_generator.demo_code_generaror.backend.server.dto.Product;
import com.code_generator.demo_code_generaror.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductDelegateImpl implements ProductsApiDelegate {

    private final ProductService productService;

    public ProductDelegateImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(this.productService.getAllVideos());
    }
}
