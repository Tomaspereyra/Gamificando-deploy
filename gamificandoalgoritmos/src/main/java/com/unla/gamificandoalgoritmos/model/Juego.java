package com.unla.gamificandoalgoritmos.model;

public class Juego {
	private Integer idJuego;
	private String nombre;
	private String descripcion;
	
	public Juego() {
		// TODO Auto-generated constructor stub
	}

	public Juego(Integer idJuego, String nombre, String descripcion) {
		super();
		this.idJuego = idJuego;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Juego(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	

}
