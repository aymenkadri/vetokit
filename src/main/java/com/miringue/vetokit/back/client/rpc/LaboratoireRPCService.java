package com.miringue.vetokit.back.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.miringue.vetokit.back.shared.model.Laboratoire;

import java.util.List;

@RemoteServiceRelativePath("gwtServices/laboratoireRPC")
public interface LaboratoireRPCService extends RemoteService {
	
	public List<Laboratoire> listAll();
	
}
