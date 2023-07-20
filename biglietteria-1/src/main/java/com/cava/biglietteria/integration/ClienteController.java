package com.cava.biglietteria.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cava.biglietteria.entities.Cliente;
import com.cava.biglietteria.services.ClienteService;

@RestController
@RequestMapping("clienti")
public class ClienteController {
	
	@Autowired
	private ClienteService clientiServices;
	
	
	@GetMapping(value = "tutti")
	public List<Cliente> getClienti(){
		return clientiServices.findAll();
	}
	
	@GetMapping("test")
	public String getClientiTest(){
		return "hello bitches";
	}
	

				
	}
	
	
	

