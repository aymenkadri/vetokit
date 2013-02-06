package com.miringue.vetokit.back.server.rpc;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.miringue.vetokit.back.client.rpc.ClientRPCService;
import com.miringue.vetokit.back.server.dao.impl.ObjectifyClientDAO;
import com.miringue.vetokit.back.shared.model.Client;
import org.apache.log4j.Logger;

import java.util.List;

@SuppressWarnings("serial")
public class ClientRPCServiceImpl extends RemoteServiceServlet implements ClientRPCService {

	private final static Logger LOGGER = Logger.getLogger(ClientRPCServiceImpl.class.getSimpleName());
	
	private ObjectifyClientDAO clientDAO = new ObjectifyClientDAO();

	@Override
	public List<Client> listAll() {
		LOGGER.debug("ListAll");
		return clientDAO.listAll();
	}

}
