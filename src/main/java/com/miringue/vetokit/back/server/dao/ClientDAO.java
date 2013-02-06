package com.miringue.vetokit.back.server.dao;

import com.miringue.vetokit.back.shared.model.Client;

import java.util.List;

public interface ClientDAO extends GenericDAO<Client> {

	public void addOrUpdate(Client client) throws RuntimeException, Error;
	public void delete(Client client) throws RuntimeException, Error;
	public List<Client> listAll() throws RuntimeException, Error;
}
