package com.yeralitas.yeralitaspringboot.controllers;

import com.yeralitas.yeralitaspringboot.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {
  @Autowired ClientService clientService;
}
