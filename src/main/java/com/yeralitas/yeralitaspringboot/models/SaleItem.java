package com.yeralitas.yeralitaspringboot.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "saleItems")
public class SaleItem {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "saleItemId")
  private Long saleItemId;

  @Column private Integer quantity;

  @ManyToOne
  @JoinColumn(name = "product", nullable = false)
  private Product product;

  @ManyToOne
  @JoinColumn(name = "saleId",nullable = false)
  private Sale sale;
}
