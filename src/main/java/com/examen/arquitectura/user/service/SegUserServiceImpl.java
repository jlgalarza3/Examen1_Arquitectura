package com.examen.arquitectura.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.arquitectura.user.entity.SegUser;

@Service
public class SegUserServiceImpl implements SegUserService {
	
	@Autowired
	SegUserRepository segUserRepository;
	
	@Override
	public List<SegUser> getAllUsers() {
		return segUserRepository.findAll();
	}
	
}