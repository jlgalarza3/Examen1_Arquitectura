package com.examen.arquitectura.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.arquitectura.user.model.SegUser;
import com.examen.arquitectura.user.service.SegUserService;

@RestController
@RequestMapping("/api")
public class SegUserController {

	@Autowired
	SegUserService segUserService;

	@GetMapping("/users")
	public List<SegUser> getAllUsers() {
		return segUserService.getAllUsers();
	}

	@GetMapping("/users/status")
	public List<SegUser> findByStatus(String status) {
		return segUserService.findByStatus(status);
	}
}