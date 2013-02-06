package com.miringue.vetokit.back.server.rpc;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.miringue.vetokit.back.client.rpc.MedicamentRPCService;
import com.miringue.vetokit.back.server.dao.impl.ObjectifyMedicamentDAO;
import com.miringue.vetokit.back.shared.model.Medicament;
import org.apache.log4j.Logger;

import java.util.List;

@SuppressWarnings("serial")
public class MedicamentRPCServiceImpl extends RemoteServiceServlet implements MedicamentRPCService {
	
	private final static Logger LOGGER = Logger.getLogger(MedicamentRPCServiceImpl.class.getSimpleName());
	
	private ObjectifyMedicamentDAO medicamentDAO = new ObjectifyMedicamentDAO();

	@Override
	public List<Medicament> listAll() {
		LOGGER.debug("ListAll");
		return medicamentDAO.listAll();
	}

}
