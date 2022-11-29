package com.examen.arquitectura.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SegUserRepository extends JpaRepository<SegUser, Integer> {
	List<SegUser> findByCodeUser(Integer codeUser);
}
