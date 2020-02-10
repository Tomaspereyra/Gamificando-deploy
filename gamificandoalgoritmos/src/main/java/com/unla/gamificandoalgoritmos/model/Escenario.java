package com.unla.gamificandoalgoritmos.model;

import java.util.List;

public class Escenario {
	private Integer idEscenario;
	private Curso idCurso;
	private List<String> bloquesPermitidos;
	private Integer cantMaxBloques;
	private String hint;
	private List<String> posibleSolucion;
	private String descripcion;
	
	public Escenario() {
		// TODO Auto-generated constructor stub
	}

	
	public Integer getIdEscenario() {
		return idEscenario;
	}

	public void setIdEscenario(Integer idEscenario) {
		this.idEscenario = idEscenario;
	}

	public Curso getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Curso idCurso) {
		this.idCurso = idCurso;
	}

	public List<String> getBloquesPermitidos() {
		return bloquesPermitidos;
	}

	public void setBloquesPermitidos(List<String> bloquesPermitidos) {
		this.bloquesPermitidos = bloquesPermitidos;
	}

	public Integer getCantMaxBloques() {
		return cantMaxBloques;
	}

	public void setCantMaxBloques(Integer cantMaxBloques) {
		this.cantMaxBloques = cantMaxBloques;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public List<String> getPosibleSolucion() {
		return posibleSolucion;
	}

	public void setPosibleSolucion(List<String> posibleSolucion) {
		this.posibleSolucion = posibleSolucion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
