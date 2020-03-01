package com.unla.gamificandoalgoritmos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.gamificandoalgoritmos.websecurity.Usuario;


public interface IUserRepository extends JpaRepository<Usuario,Integer> {

	Usuario findByEmail(String email);
}
