package com.yeralitas.yeralitaspringboot.repositories;

import com.yeralitas.yeralitaspringboot.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {}
