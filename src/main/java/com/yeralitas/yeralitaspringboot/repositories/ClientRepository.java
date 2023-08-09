package com.yeralitas.yeralitaspringboot.repositories;

import com.yeralitas.yeralitaspringboot.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {}
