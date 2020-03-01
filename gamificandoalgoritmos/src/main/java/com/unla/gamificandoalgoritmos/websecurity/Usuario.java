package com.unla.gamificandoalgoritmos.websecurity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Usuario {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native",strategy="native")
	private Integer idUsuario;
	private String email;
	private String password;
	
	

	public Usuario(Integer idUsuario,String email, String password) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.password = password;
	}
	



	public Usuario(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	




	public Integer getIdUsuario() {
		return idUsuario;
	}




	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}




	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Usuario() {
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", email=" + email + ", password=" + password + "]";
	}
	

}
