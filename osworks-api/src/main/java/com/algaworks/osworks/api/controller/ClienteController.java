package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João das Couves");
		cliente1.setTelefone("19 99999-1111");
		cliente1.setEmail("joao@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria da Silva");
		cliente2.setTelefone("11 97777-1111");
		cliente2.setEmail("maria@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
}
