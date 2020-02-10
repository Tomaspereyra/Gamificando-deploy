package com.unla.gamificandoalgoritmos.model;

import java.util.List;

public class Curso {
	private Integer idCurso;
	private Juego idJuego;
	private List<Escenario> escenarios;
	private Boolean sePuedeSaltear;
	private Docente docenteCreador;
	private String nombre;
	private String descripcion;
	
	
	public Curso(Integer idCurso, Juego idJuego, List<Escenario> escenarios, Boolean sePuedeSaltear,
			Docente docenteCreador, String nombre, String descripcion) {
		super();
		this.idCurso = idCurso;
		this.idJuego = idJuego;
		this.escenarios = escenarios;
		this.sePuedeSaltear = sePuedeSaltear;
		this.docenteCreador = docenteCreador;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public Juego getIdJuego() {
		return idJuego;
	}
	public void setIdJuego(Juego idJuego) {
		this.idJuego = idJuego;
	}
	public List<Escenario> getEscenarios() {
		return escenarios;
	}
	public void setEscenarios(List<Escenario> escenarios) {
		this.escenarios = escenarios;
	}
	public Boolean getSePuedeSaltear() {
		return sePuedeSaltear;
	}
	public void setSePuedeSaltear(Boolean sePuedeSaltear) {
		this.sePuedeSaltear = sePuedeSaltear;
	}
	public Docente getDocenteCreador() {
		return docenteCreador;
	}
	public void setDocenteCreador(Docente docenteCreador) {
		this.docenteCreador = docenteCreador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

}
