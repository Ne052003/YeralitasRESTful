package com.yeralitas.yeralitaspringboot.services;

import com.yeralitas.yeralitaspringboot.models.Product;
import com.yeralitas.yeralitaspringboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
  @Autowired ProductRepository productRepository;

  public Boolean addProduct(Product product) {
    Optional<Product> optProduct = productRepository.findById(product.getProductId());
    if (optProduct.isEmpty()) {
      productRepository.save(product);
      return true;
    }
    return false;
  }

  public Optional<Product> getProduct(Long productId) {
    return productRepository.findById(productId);
  }
}
