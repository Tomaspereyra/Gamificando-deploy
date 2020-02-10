package com.unla.gamificandoalgoritmos.model;

import java.util.List;

public class CursoIniciado {
	private Integer idCursoIniciado;
	private Curso curso;
	private List<EscenarioEnProceso> escenariosEnProceso;
	
	public CursoIniciado() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdCursoIniciado() {
		return idCursoIniciado;
	}

	public void setIdCursoIniciado(Integer idCursoIniciado) {
		this.idCursoIniciado = idCursoIniciado;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<EscenarioEnProceso> getEscenariosRealizados() {
		return escenariosEnProceso;
	}

	public void setEscenariosRealizados(List<EscenarioEnProceso> escenariosEnProceso) {
		this.escenariosEnProceso = escenariosEnProceso;
	}
	

}
