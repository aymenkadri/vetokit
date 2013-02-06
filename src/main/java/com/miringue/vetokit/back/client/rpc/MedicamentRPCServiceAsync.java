package com.miringue.vetokit.back.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.miringue.vetokit.back.shared.model.Medicament;

import java.util.List;


public interface MedicamentRPCServiceAsync {

	public void listAll(AsyncCallback<List<Medicament>> medicaments);

}
