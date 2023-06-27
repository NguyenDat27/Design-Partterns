package com.designpattern.bridgepattern.controller;

import com.designpattern.bridgepattern.ibookanddvd.Display;
import com.designpattern.bridgepattern.impl.ConsoleDisplay;
import com.designpattern.bridgepattern.impl.HtmlDisplay;
import com.designpattern.bridgepattern.bridge.Product;
import com.designpattern.bridgepattern.concretions.DVD;
import com.designpattern.bridgepattern.concretions.Book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/bridge")
    public String index(Model model) {
        // Create a Book object and pass data to the Model
        Display consoleDisplay = new ConsoleDisplay();
        Product book = new Book("Book", 29.99, "John Doe", consoleDisplay);
        model.addAttribute("bookName", book.getName());
        model.addAttribute("bookPrice", book.getPrice());
        model.addAttribute("bookAuthor", ((Book) book).getDetails());

        // Create a DVD object and pass data to the Model
        Display htmlDisplay = new HtmlDisplay();
        Product dvd = new DVD("DVD", 14.99, 120, htmlDisplay);
        model.addAttribute("dvdName", dvd.getName());
        model.addAttribute("dvdPrice", dvd.getPrice());
        model.addAttribute("dvdDuration", ((DVD) dvd).getDetails());

        return "bookanddvd";
    }
}



