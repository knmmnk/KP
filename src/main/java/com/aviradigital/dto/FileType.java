package com.aviradigital.dto;

import java.util.Arrays;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;

public class FileType {
	
	private String fileType;
	private byte[] fileBytes;
	private ResponseEntity<InputStreamResource> responseEntity;
	
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public byte[] getFileBytes() {
		return fileBytes;
	}
	public void setFileBytes(byte[] fileBytes) {
		this.fileBytes = fileBytes;
	}
	public ResponseEntity<InputStreamResource> getResponseEntity() {
		return responseEntity;
	}
	public void setResponseEntity(ResponseEntity<InputStreamResource> responseEntity) {
		this.responseEntity = responseEntity;
	}
	
	@Override
	public String toString() {
		return "FileType [fileType=" + fileType + ", fileBytes=" + Arrays.toString(fileBytes) + ", responseEntity="
				+ responseEntity + "]";
	}
	
	

}
