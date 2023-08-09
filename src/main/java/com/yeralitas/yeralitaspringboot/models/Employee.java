package com.yeralitas.yeralitaspringboot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Employee extends User {

  @Column private LocalDate admissionDate;

  @Column private LocalDate birthdate;
}
