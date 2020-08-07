package com.aviradigital.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.aviradigital.dao.AbstractCommonDAO;
import com.aviradigital.dao.ContractTypeDAO;
import com.aviradigital.dto.ContractTypeDTO;
import com.aviradigital.dto.WorkflowDTO;

@Repository
public class ContractTypeDAOImpl extends AbstractCommonDAO implements ContractTypeDAO {
	
	public static final String CONTRACT_TYPE_LIST_BY_ORG_ID = "contract.type.list.by.org.id";
	public static final String WORKFLOW_LIST_BY_ORG_ID = "workflow.list.by.org.id";

	private Properties contractTypeQueries;
	
	@Autowired
	public ContractTypeDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
		contractTypeQueries = loadQueries(CONTRACT_QUERIES_FILE_NAME, ContractTypeDAOImpl.class, CONTRACT_TYPE_LIST_BY_ORG_ID);
	}
	
	public List<ContractTypeDTO> getContractTypeList(long orgId) {
		SqlParameterSource parameters = new MapSqlParameterSource("orgId",orgId);
		return getNamedParameterJdbcTemplate().query(contractTypeQueries.getProperty(CONTRACT_TYPE_LIST_BY_ORG_ID),  parameters, new RowMapper<ContractTypeDTO>() {
			@Override
			public ContractTypeDTO mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				ContractTypeDTO contractTypeDTO = new ContractTypeDTO();
				contractTypeDTO.setContractTypeId(rs.getLong("contract_type_id"));
				contractTypeDTO.setContractName(rs.getString("contract_name"));
				contractTypeDTO.setIsActive(rs.getLong("is_active"));
				contractTypeDTO.setOrgId(rs.getLong("org_id"));
				contractTypeDTO.setOrgName(rs.getString("org_name"));
				contractTypeDTO.setCreatedDate(rs.getDate("created_date"));
				contractTypeDTO.setCreatedByName(rs.getString("created_by"));
				return contractTypeDTO;
			}
		});
	}
	
	public List<WorkflowDTO> getWorkflowList(long orgId) {
		SqlParameterSource parameters = new MapSqlParameterSource("orgId",orgId);
		return getNamedParameterJdbcTemplate().query(contractTypeQueries.getProperty(WORKFLOW_LIST_BY_ORG_ID),  parameters, new RowMapper<WorkflowDTO>() {
			@Override
			public WorkflowDTO mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				WorkflowDTO workFlowDTO = new WorkflowDTO();
				workFlowDTO.setWorkflowId(rs.getLong("contract_type_id"));
				workFlowDTO.setWorkflowName(rs.getString("contract_name"));
				workFlowDTO.setIsActive(rs.getLong("is_active"));
				workFlowDTO.setOrgId(rs.getLong("org_id"));
				workFlowDTO.setOrgName(rs.getString("org_name"));
				workFlowDTO.setCreatedDate(rs.getDate("created_date"));
				workFlowDTO.setCreatedByName(rs.getString("created_by"));
				return workFlowDTO;
			}
		});
	}

}
