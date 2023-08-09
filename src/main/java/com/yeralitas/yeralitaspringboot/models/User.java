package com.yeralitas.yeralitaspringboot.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  @Column(name = "userId")
  private Long userId;

  @Column(unique = true, nullable = false)
  private String name;

  @Column(nullable = false)
  private String lastName;

  @Column private String phone;
  @Column private String direction;
}
