package com.everis.nttdatacenters_hibernate_t1_SMC;

import java.util.List;

import org.hibernate.Session;

public interface ClienteDAO {
	public Cliente searchByName(String name);
	public List<Cliente> searchClients();
}
