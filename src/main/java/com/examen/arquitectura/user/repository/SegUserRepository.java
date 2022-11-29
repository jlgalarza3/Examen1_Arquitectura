package com.examen.arquitectura.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.arquitectura.user.model.SegUser;

@Repository
public interface SegUserRepository extends JpaRepository<SegUser, Integer> {
	List<SegUser> findByCodeUser(Integer codeUser);

	List<SegUser> findByStatus(String status);
}
