package com.miringue.vetokit.back.server.dao.impl;

import com.googlecode.objectify.ObjectifyService;
import com.miringue.vetokit.back.server.dao.MedicamentDAO;
import com.miringue.vetokit.back.shared.model.Medicament;

import java.util.List;

public class ObjectifyMedicamentDAO extends ObjectifyGenericDAO<Medicament> implements MedicamentDAO {

	static {
		ObjectifyService.register(Medicament.class);
	}
	
	@Override
	public List<Medicament> listAll() throws RuntimeException, Error {
		return super.listAll(Medicament.class);
	}

}
