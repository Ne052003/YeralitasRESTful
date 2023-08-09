package com.yeralitas.yeralitaspringboot.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "productId")
  private Long productId;

  @Column private String name;

  @Column private Double price;

  @Column private LocalDate admissionDate;

  @Column private LocalDate dueDate;
}
