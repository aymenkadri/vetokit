package com.miringue.vetokit.back.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.miringue.vetokit.back.shared.model.Laboratoire;

import java.util.List;


public interface LaboratoireRPCServiceAsync {

	public void listAll(AsyncCallback<List<Laboratoire>> labs);

}
