package com.miringue.vetokit.back.server.dao.impl;

import com.googlecode.objectify.ObjectifyService;
import com.miringue.vetokit.back.server.dao.LaboratoireDAO;
import com.miringue.vetokit.back.shared.model.Laboratoire;

import java.util.List;

public class ObjectifyLaboratoireDAO extends ObjectifyGenericDAO<Laboratoire> implements LaboratoireDAO {

	static {
		ObjectifyService.register(Laboratoire.class);
	}
	
	@Override
	public List<Laboratoire> listAll() throws RuntimeException, Error {
		return super.listAll(Laboratoire.class);
	}

}
