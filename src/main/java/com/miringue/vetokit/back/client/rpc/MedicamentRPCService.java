package com.miringue.vetokit.back.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.miringue.vetokit.back.shared.model.Medicament;

import java.util.List;

@RemoteServiceRelativePath("gwtServices/medicamentsRPC")
public interface MedicamentRPCService extends RemoteService {
	
	public List<Medicament> listAll();
	
}
