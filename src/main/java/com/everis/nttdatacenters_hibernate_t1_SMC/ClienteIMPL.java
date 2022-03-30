package com.everis.nttdatacenters_hibernate_t1_SMC;

import java.util.*;

import org.hibernate.Session;

public class ClienteIMPL implements ClienteDAO {
	
	private Session sesion;
	
	public ClienteIMPL(Session sesion) {
		super();
		this.sesion = sesion;
	}
	
	
	@Override
	public Cliente searchByName(String name) {
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> searchClients() {
		List<Cliente> res = new ArrayList<Cliente>();
		
		// Verificación de sesión abierta.
		if(!sesion.getTransaction().isActive()) {
			sesion.getTransaction().begin();
		}
		
		// Localiza jugadores en función del nombre.
		res = sesion.createQuery("FROM " + Cliente.class).list();
		
		return  res;
	}
	
	

}
