package com.everis.nttdatacenters_hibernate_t1_SMC;

import javax.persistence.*;

@Entity
@Table(name="Cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nombre",nullable=false)
	private String nombre;
	
	@Column(name="primerApellido",nullable=false)
	private String primerApellido;
	
	@Column(name="segundoApellido",nullable=false)
	private String segundoApellido;
	
	@Column(name="surname",unique=true,nullable=false,length=9)//Falta poner hasta 9 caracteres
	private String dni;

	public Cliente(Long id, String nombre, String primerApellido, String segundoApellido, String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.dni = dni;
	}

	public Cliente() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


}
