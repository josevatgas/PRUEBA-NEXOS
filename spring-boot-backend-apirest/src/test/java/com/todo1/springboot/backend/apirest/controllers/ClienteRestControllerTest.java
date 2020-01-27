package com.todo1.springboot.backend.apirest.controllers;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.todo1.springboot.backend.apirest.models.entity.Cliente;
import com.todo1.springboot.backend.apirest.models.entity.Region;


public class ClienteRestControllerTest {
	
	 // Identifica el método como una prueba		
	@Test
	public void indexTest() {			
		ClienteRestController clienteController = new ClienteRestController();	
		List<Cliente> clientes =clienteController.index();
		assertNotNull(clientes);	
	}
	
	@Test
	public void apiClientesTest() {			
		ClienteRestController clienteController = new ClienteRestController();	
		Cliente cliente = new Cliente();
		cliente.setNombre("Jose");
		cliente.setApellido("Vargas");
		cliente.setCreateAt(new Date());
		Region region = new Region();
		region.setId(1L);
		region.setNombre("Sudamérica");
		cliente.setRegion(region);
		
		Map<String, Object> clientemap = (Map<String, Object>) clienteController.create(cliente, null);
		Cliente clienteSave = (Cliente) clientemap.get("cliente");
		
		cliente.setId(clienteSave.getId());
		
		assertEquals(clienteSave, cliente);
		assertNotNull(clienteController.delete(clienteSave.getId()));	
		
	}
	
}
