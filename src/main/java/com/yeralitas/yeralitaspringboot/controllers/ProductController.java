package com.yeralitas.yeralitaspringboot.controllers;

import com.yeralitas.yeralitaspringboot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
  @Autowired ProductService productService;

}
