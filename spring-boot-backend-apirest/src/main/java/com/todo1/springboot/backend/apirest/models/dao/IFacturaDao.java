package com.todo1.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.todo1.springboot.backend.apirest.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}
