package com.example.practica.service;

import java.util.List;



import com.example.practica.entity.Users;

public interface UsersService {
	
	public Users registrar(Users users);
	
	public Users actualizar(Users users);
	
	public void eliminar(Users users);
	
	public List<Users> ver();

}