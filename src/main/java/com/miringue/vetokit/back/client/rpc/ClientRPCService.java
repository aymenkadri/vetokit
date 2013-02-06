package com.miringue.vetokit.back.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.miringue.vetokit.back.shared.model.Client;

import java.util.List;

@RemoteServiceRelativePath("gwtServices/clientRPC")
public interface ClientRPCService extends RemoteService {
	
	public List<Client> listAll();
	
}
