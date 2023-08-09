package com.yeralitas.yeralitaspringboot.repositories;

import com.yeralitas.yeralitaspringboot.models.Client;
import com.yeralitas.yeralitaspringboot.models.Employee;
import com.yeralitas.yeralitaspringboot.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale,Long> {
    List<Sale> findAllByClient(Client client);
    List<Sale> findAllByEmployee(Employee employee);
}
