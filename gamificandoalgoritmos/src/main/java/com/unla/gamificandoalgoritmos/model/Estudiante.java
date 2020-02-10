package com.unla.gamificandoalgoritmos.model;

import java.util.Date;
import java.util.List;

public class Estudiante extends Usuario {
	
	private List<CursoIniciado> cursosIniciados;
	
	public Estudiante(Integer idUser, String username, String password, String name, String lastName, String email,
			Date date) {
		super(idUser, username, password, name, lastName, email, date);
		// TODO Auto-generated constructor stub
	}
	

	

}
