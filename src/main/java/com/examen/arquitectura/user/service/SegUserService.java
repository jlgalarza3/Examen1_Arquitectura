package com.examen.arquitectura.user.service;

import java.util.List;

import com.examen.arquitectura.user.model.SegUser;

public interface SegUserService {

	List<SegUser> getAllUsers();

	List<SegUser> findByStatus(String status);

}
