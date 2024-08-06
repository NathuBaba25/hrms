package com.hrms.service;

import java.util.List;

import com.hrms.model.RegisterModel;

public interface UserService  {
	List<RegisterModel> finduser(RegisterModel model);
	int registerUser(RegisterModel model);
}
