package com.miringue.vetokit.back.server.dao;

import com.miringue.vetokit.back.shared.model.Medicament;

import java.util.List;

public interface MedicamentDAO extends GenericDAO<Medicament> {

	public void addOrUpdate(Medicament medicament) throws RuntimeException, Error;
	public void delete(Medicament medicament) throws RuntimeException, Error;
	public List<Medicament> listAll() throws RuntimeException, Error;
}
