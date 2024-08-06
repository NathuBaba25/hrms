package com.hrms.dao;

import java.util.List;

import com.hrms.model.RegisterModel;

public interface RegisterDao {

	int registerUser(RegisterModel model);
	List<RegisterModel> finduser(RegisterModel user);
	
}
