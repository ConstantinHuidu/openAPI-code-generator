package com.code_generator.demo_code_generaror.mapper;

import com.code_generator.demo_code_generaror.backend.server.dto.Product;
import com.code_generator.demo_code_generaror.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    List<Product> toDto (List<ProductEntity> products);
}
