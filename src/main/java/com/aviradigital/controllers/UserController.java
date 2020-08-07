package com.aviradigital.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aviradigital.dao.UserDAO;
import com.aviradigital.dto.UserDTO;

@RestController
@RequestMapping("kontrakt")
public class UserController {
	
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping(value="/getUserDetails", method=RequestMethod.GET)
	public List<UserDTO> getUserDetails(@RequestParam("orgId") long orgId) {
		return userDao.getUserDetails(orgId);
	}

}
