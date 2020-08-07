package com.aviradigital.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ContractTypeDTO {
	
	private long contractTypeId;
	private String contractName;
	private long isActive;
	private long orgId;
	@JsonIgnore
	private Date createdDate;
	@JsonIgnore
	private Date updatedDate;
	private long createdBy;
	private long updatedBy;
	
	private String orgName;
	private String formatCreatedDate,formatUpdatedDate;
	private String createdByName,updatedByName;
	

	public long getContractTypeId() {
		return contractTypeId;
	}

	public void setContractTypeId(long contractTypeId) {
		this.contractTypeId = contractTypeId;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public long getIsActive() {
		return isActive;
	}

	public void setIsActive(long isActive) {
		this.isActive = isActive;
	}

	public long getOrgId() {
		return orgId;
	}

	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getFormatCreatedDate() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		if(this.createdDate!=null)
			return format.format(this.createdDate);
		return null;
	}

	public void setFormatCreatedDate(String formatCreatedDate) {
		this.formatCreatedDate = formatCreatedDate;
	}

	public String getFormatUpdatedDate() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		if(this.updatedDate!=null)
			return format.format(this.updatedDate);
		return null;
	}

	public void setFormatUpdatedDate(String formatUpdatedDate) {
		this.formatUpdatedDate = formatUpdatedDate;
	}
	
	public String getCreatedByName() {
		return createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public String getUpdatedByName() {
		return updatedByName;
	}

	public void setUpdatedByName(String updatedByName) {
		this.updatedByName = updatedByName;
	}

	@Override
	public String toString() {
		return "ContractTypeDTO [contractTypeId=" + contractTypeId + ", contractName=" + contractName + ", isActive="
				+ isActive + ", orgId=" + orgId + ", createdDate=" + createdDate + ", createdBy=" + createdBy
				+ ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", orgName=" + orgName
				+ ", formatCreatedDate=" + formatCreatedDate + ", formatUpdatedDate=" + formatUpdatedDate
				+ ", createdByName=" + createdByName + ", updatedByName=" + updatedByName + "]";
	}

	

}
