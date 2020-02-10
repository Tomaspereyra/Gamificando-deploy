package com.unla.gamificandoalgoritmos.model;

import java.util.Date;

public class EscenarioEnProceso {
	private Integer idEscenarioEnProceso;
	private Escenario idEscenario;
	private Date fechaInicio;
	private Date fechaFinalizacion;
	private Integer puntajeObtenido;
	private String SolucionBrindada;
	private Integer cantidadBloquesUtilizados;
	private Double tiempoSolucion;
	private Integer intentos;
	
	public EscenarioEnProceso() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdEscenarioEnProceso() {
		return idEscenarioEnProceso;
	}

	public void setIdEscenarioEnProceso(Integer idEscenarioEnProceso) {
		this.idEscenarioEnProceso = idEscenarioEnProceso;
	}

	public Escenario getIdEscenario() {
		return idEscenario;
	}

	public void setIdEscenario(Escenario idEscenario) {
		this.idEscenario = idEscenario;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public Integer getPuntajeObtenido() {
		return puntajeObtenido;
	}

	public void setPuntajeObtenido(Integer puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
	}

	public String getSolucionBrindada() {
		return SolucionBrindada;
	}

	public void setSolucionBrindada(String solucionBrindada) {
		SolucionBrindada = solucionBrindada;
	}

	public Integer getCantidadBloquesUtilizados() {
		return cantidadBloquesUtilizados;
	}

	public void setCantidadBloquesUtilizados(Integer cantidadBloquesUtilizados) {
		this.cantidadBloquesUtilizados = cantidadBloquesUtilizados;
	}

	public Double getTiempoSolucion() {
		return tiempoSolucion;
	}

	public void setTiempoSolucion(Double tiempoSolucion) {
		this.tiempoSolucion = tiempoSolucion;
	}

	public Integer getIntentos() {
		return intentos;
	}

	public void setIntentos(Integer intentos) {
		this.intentos = intentos;
	}
	

}
