package com.miringue.vetokit.back.server.rpc;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.miringue.vetokit.back.client.rpc.LaboratoireRPCService;
import com.miringue.vetokit.back.server.dao.impl.ObjectifyLaboratoireDAO;
import com.miringue.vetokit.back.shared.model.Laboratoire;
import org.apache.log4j.Logger;

import java.util.List;

@SuppressWarnings("serial")
public class LaboratoireRPCServiceImpl extends RemoteServiceServlet implements LaboratoireRPCService {
	
	private final static Logger LOGGER = Logger.getLogger(LaboratoireRPCServiceImpl.class.getSimpleName());
	
	private ObjectifyLaboratoireDAO articleDAO = new ObjectifyLaboratoireDAO();

	@Override
	public List<Laboratoire> listAll() {
		LOGGER.debug("ListAll");
		return articleDAO.listAll();
	}

}
