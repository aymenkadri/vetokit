package com.miringue.vetokit.back.server.dao;

import com.miringue.vetokit.back.shared.model.Laboratoire;

import java.util.List;

public interface LaboratoireDAO extends GenericDAO<Laboratoire> {

	public void addOrUpdate(Laboratoire laboratoire) throws RuntimeException, Error;
	public void delete(Laboratoire laboratoire) throws RuntimeException, Error;
	public List<Laboratoire> listAll() throws RuntimeException, Error;
}
