package com.designpattern.facadepattern.service;

import com.designpattern.facadepattern.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        // Thực hiện logic để lấy danh sách sản phẩm từ nguồn dữ liệu (ví dụ: cơ sở dữ liệu)
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "iPhone", 1000.0));
        products.add(new Product(2, "Samsung Galaxy", 800.0));
        products.add(new Product(3, "Google Pixel", 700.0));
        return products;
    }
}

