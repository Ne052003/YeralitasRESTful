package com.yeralitas.yeralitaspringboot.controllers;

import com.yeralitas.yeralitaspringboot.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class SaleController {
  @Autowired SaleService saleService;
}
