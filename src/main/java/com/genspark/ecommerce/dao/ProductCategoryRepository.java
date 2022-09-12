package com.genspark.ecommerce.dao;

import com.genspark.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Do not want default as it adds an s to the end to make plural we want a simple reference instead.
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
