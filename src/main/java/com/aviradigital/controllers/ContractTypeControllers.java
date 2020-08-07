package com.aviradigital.controllers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aviradigital.dao.ContractTypeDAO;
import com.aviradigital.dto.ContractTypeDTO;
import com.aviradigital.dto.FileType;
import com.aviradigital.dto.WorkflowDTO;

@RestController
@RequestMapping("kontrakt")
public class ContractTypeControllers {

	@Autowired
	private ContractTypeDAO contractTypeDAO;
	
	@GetMapping("/getContractTypes")
	public List<ContractTypeDTO> getContractTypes(@RequestParam("orgId") long orgId) {
		return contractTypeDAO.getContractTypeList(orgId);
	}
	
	@GetMapping("/getWorkflowList")
	public List<WorkflowDTO> getWorkflowTypes(@RequestParam("orgId") long orgId) {
		return contractTypeDAO.getWorkflowList(orgId);
	}
	
	
	
}
