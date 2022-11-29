package com.examen.arquitectura.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.arquitectura.user.model.SegUser;
import com.examen.arquitectura.user.repository.SegUserRepository;

@Service
public class SegUserServiceImpl implements SegUserService {

	@Autowired
	SegUserRepository segUserRepository;

	@Override
	public List<SegUser> getAllSegUsers() {
		return segUserRepository.findAll();
	}

	@Override
	public List<SegUser> getSegUserByStatus(String status) {
		return segUserRepository.findByStatus(status);
	}

}