package main.app.controller;

import main.app.entity.Product;
import main.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class productController {

    @Autowired
    ProductRepository product;

    @GetMapping("/sayhello")
    public String sayHello() {
        return "Hello";

    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return product.findAll();
    }
}

