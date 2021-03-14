package com.clientesrest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientesrest.models.Cliente;
import com.clientesrest.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	@PostMapping
	public Cliente add(@Valid @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
