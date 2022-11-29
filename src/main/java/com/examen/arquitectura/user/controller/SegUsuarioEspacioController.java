package com.examen.arquitectura.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.arquitectura.user.model.SegUsuarioEspacio;
import com.examen.arquitectura.user.service.SegUsuarioEspacioService;

@RestController
@RequestMapping("/api")
public class SegUsuarioEspacioController {
	@Autowired
	SegUsuarioEspacioService segUsuarioEspacioService;

	@GetMapping("/segUsuarioEspacio")
	public List<SegUsuarioEspacio> getAllSegUsuarioEspacios() {
		return segUsuarioEspacioService.getAllSegUsuarioEspacios();
	}

}