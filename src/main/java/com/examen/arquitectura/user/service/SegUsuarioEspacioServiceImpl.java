package com.examen.arquitectura.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.arquitectura.user.entity.SegUser;

@Service
public class SegUsuarioEspacioServiceImpl implements SegUsuarioEspacioService {
	@Autowired
	SegUsuarioEspacioRepository segUsuarioEspacioRepository;
	
	@Override
	public List<SegUsuarioEspacio> getAllUsersSpace() {
		return segUsuarioEspacioRepository.findAll();
	}
}