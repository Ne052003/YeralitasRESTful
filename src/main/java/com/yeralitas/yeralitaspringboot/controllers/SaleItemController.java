package com.yeralitas.yeralitaspringboot.controllers;

import com.yeralitas.yeralitaspringboot.services.SaleItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saleItems")
public class SaleItemController {
  @Autowired SaleItemService saleItemService;
}
