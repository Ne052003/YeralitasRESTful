package com.yeralitas.yeralitaspringboot.services;

import com.yeralitas.yeralitaspringboot.models.SaleItem;
import com.yeralitas.yeralitaspringboot.repositories.SaleItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaleItemService {
  @Autowired SaleItemRepository saleItemRepository;

  public Boolean createSaleItem(SaleItem saleItem) {
    Optional<SaleItem> optSaleItem = saleItemRepository.findById(saleItem.getSaleItemId());
    if (optSaleItem.isEmpty()) {
      saleItemRepository.save(saleItem);
      return true;
    }
    return false;
  }

  public Optional<SaleItem> getSaleItem(Long saleId) {
    return saleItemRepository.findById(saleId);
  }
}
