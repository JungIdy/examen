package com.example.practica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica.entity.Users;
import com.example.practica.repository.UsersRepository;

@Service
public class UsersServiceImplements implements UsersService {
	
	@Autowired
	private UsersRepository usersRepository;

	@Override
	public Users registrar(Users users) {
		// TODO Auto-generated method stub
		return usersRepository.save(users);
	}

	@Override
	public Users actualizar(Users users) {
		// TODO Auto-generated method stub
		return usersRepository.save(users);
	}

	@Override
	public void eliminar(Users users) {
		// TODO Auto-generated method stub
		usersRepository.delete(users);
	}

	@Override
	public List<Users> ver() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}
}