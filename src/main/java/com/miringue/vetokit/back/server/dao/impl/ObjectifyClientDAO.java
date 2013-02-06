package com.miringue.vetokit.back.server.dao.impl;

import com.googlecode.objectify.ObjectifyService;
import com.miringue.vetokit.back.server.dao.ClientDAO;
import com.miringue.vetokit.back.shared.model.Client;

import java.util.List;

public class ObjectifyClientDAO extends ObjectifyGenericDAO<Client> implements ClientDAO {

	static {
		ObjectifyService.register(Client.class);
	}
	
	@Override
	public List<Client> listAll() throws RuntimeException, Error {
		return super.listAll(Client.class);
	}

}
