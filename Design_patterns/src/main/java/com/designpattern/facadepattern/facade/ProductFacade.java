package com.designpattern.facadepattern.facade;

import com.designpattern.facadepattern.model.Product;
import com.designpattern.facadepattern.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductFacade {
    private ProductService productService;

    public ProductFacade(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
