package com.designpattern.proxypattern.controller;

import com.designpattern.proxypattern.proxy.ImageProxy;
import com.designpattern.proxypattern.iimage.Image;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageController {
    @GetMapping("/proxy")
    public String image(Model model) {
        Image imageProxy = new ImageProxy("image.jpg");

        // Pass imageProxy to the view
        model.addAttribute("image", imageProxy);

        return "image";
    }
}
