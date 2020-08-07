package com.aviradigital.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class WorkflowDTO {
	
	private long workflowId;
	private String workflowName;
	private long isActive;
	private long orgId;
	@JsonIgnore
	private Date createdDate;
	@JsonIgnore
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;
	
	private String orgName;
	private String formatCreatedDate,formatUpdatedDate;
	private String createdByName,updatedByName;
	
	public long getWorkflowId() {
		return workflowId;
	}
	public void setWorkflowId(long workflowId) {
		this.workflowId = workflowId;
	}
	public String getWorkflowName() {
		return workflowName;
	}
	public void setWorkflowName(String workflowName) {
		this.workflowName = workflowName;
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
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getFormatCreatedDate() {
		return formatCreatedDate;
	}
	public void setFormatCreatedDate(String formatCreatedDate) {
		this.formatCreatedDate = formatCreatedDate;
	}
	public String getFormatUpdatedDate() {
		return formatUpdatedDate;
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
	

}
