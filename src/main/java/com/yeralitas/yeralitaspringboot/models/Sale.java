package com.yeralitas.yeralitaspringboot.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "saleId")
    private Long saleId;

    @ManyToOne
    @JoinColumn(name = "employeeId", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "clientId",nullable = false)
    private Client client;

    @OneToMany(mappedBy = "sale")
    private List<SaleItem> products;

    @Column(nullable = false)
    private Long total;

}
