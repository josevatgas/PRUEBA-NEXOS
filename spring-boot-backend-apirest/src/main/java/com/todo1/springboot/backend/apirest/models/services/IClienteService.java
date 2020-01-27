package com.todo1.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.todo1.springboot.backend.apirest.models.entity.Cliente;
import com.todo1.springboot.backend.apirest.models.entity.Factura;
import com.todo1.springboot.backend.apirest.models.entity.Producto;
import com.todo1.springboot.backend.apirest.models.entity.Region;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();
	
	public Factura findFacturaById(Long id);
	
	public Factura saveFactura(Factura factura);
	
	public void deleteFacturaById(Long id);
	
	public List<Producto> findProductoByNombre(String term);
	
	public Producto findProductoById(Long id);
	
	public Producto save(Producto producto);

}
