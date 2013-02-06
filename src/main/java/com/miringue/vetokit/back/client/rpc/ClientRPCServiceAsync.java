package com.miringue.vetokit.back.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.miringue.vetokit.back.shared.model.Client;

import java.util.List;


public interface ClientRPCServiceAsync {

	public void listAll(AsyncCallback<List<Client>> clients);

}
