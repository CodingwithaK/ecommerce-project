package com.genspark.ecommerce.config;

import com.genspark.ecommerce.entity.Product;
import com.genspark.ecommerce.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};

        // disables http methods for product to make it read-only for version 1.0

        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods)-> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods)-> httpMethods.disable(theUnsupportedActions));
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((metdata, httpMethods)-> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods)-> httpMethods.disable(theUnsupportedActions));
     }
}
