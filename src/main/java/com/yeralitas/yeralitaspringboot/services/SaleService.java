package com.yeralitas.yeralitaspringboot.services;

import com.yeralitas.yeralitaspringboot.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
  @Autowired SaleRepository saleRepository;
}
