package com.aviradigital.dao;

import java.util.List;

import com.aviradigital.dto.UserDTO;

public interface UserDAO {
	
	public List<UserDTO> getUserDetails(long orgId);
	
}
