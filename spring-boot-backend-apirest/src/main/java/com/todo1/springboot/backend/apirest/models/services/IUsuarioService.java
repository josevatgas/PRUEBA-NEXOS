package com.todo1.springboot.backend.apirest.models.services;

import com.todo1.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
