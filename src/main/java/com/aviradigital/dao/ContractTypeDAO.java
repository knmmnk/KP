package com.aviradigital.dao;

import java.util.List;

import com.aviradigital.dto.ContractTypeDTO;
import com.aviradigital.dto.WorkflowDTO;

public interface ContractTypeDAO {
	
	public List<ContractTypeDTO> getContractTypeList(long orgId);
	public List<WorkflowDTO> getWorkflowList(long orgId);


}
