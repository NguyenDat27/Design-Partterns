package com.designpattern.facadepattern.controller;

import com.designpattern.facadepattern.model.Product;
import com.designpattern.facadepattern.facade.ProductFacade;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class ProductController {
    private ProductFacade productFacade;

    public ProductController(ProductFacade productFacade) {
        this.productFacade = productFacade;
    }

    @GetMapping("/facade")
    public String home(Model model) {
        // Lấy danh sách sản phẩm thông qua ProductFacade
        List<Product> products = productFacade.getAllProducts();

        // Pass danh sách sản phẩm vào model
        model.addAttribute("products", products);

        // Return template name
        return "product";
    }
}
