package com.todo1.springboot.backend.apirest.controllers;

import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.todo1.springboot.backend.apirest.models.entity.Cliente;
import com.todo1.springboot.backend.apirest.models.entity.Factura;
import com.todo1.springboot.backend.apirest.models.entity.ItemFactura;
import com.todo1.springboot.backend.apirest.models.entity.Producto;
import com.todo1.springboot.backend.apirest.models.entity.Region;

public class FacturaRestControllerTest {
	
	@Test
	public void crearFacturaTest() {			
		FacturaRestController facturaController = new FacturaRestController();	
		Factura factura = new Factura();
		factura.setObservacion("observacion");
		Cliente cliente = new Cliente();
		cliente.setNombre("Jose");
		cliente.setApellido("Vargas");
		cliente.setCreateAt(new Date());
		Region region = new Region();
		region.setId(1L);
		region.setNombre("Sudamérica");
		cliente.setRegion(region);		
		Producto producto = new Producto();
		producto.setCantidadDisponible(5L);
		producto.setCreateAt(new Date());
		producto.setId(1L);
		producto.setNombre("Camiseta Hulk");
		producto.setPrecio(20000.0);
		ItemFactura itemFactura =new ItemFactura();
		itemFactura.setCantidad(1);
		itemFactura.setId(1L);
		itemFactura.setProducto(producto);
		List<ItemFactura> itemsFactura = new ArrayList<>();
		itemsFactura.add(itemFactura);
		factura.getItems().addAll(itemsFactura);
		factura.setCliente(cliente);
		
		assertNotNull(facturaController.crear(factura));	
	}

}
