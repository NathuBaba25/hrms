package com.hrms.service;

import java.util.List;

import com.hrms.dao.RegisterDao;
import com.hrms.dao.RegisterDaoImpl;
import com.hrms.model.RegisterModel;

public class UserServiceImpl implements UserService {

	@Override
	public int registerUser(RegisterModel model) {
		// TODO Auto-generated method stub
		// service nivigate to dao
		RegisterDao dao=new RegisterDaoImpl();
		return dao.registerUser(model);
	}

	@Override
	public List<RegisterModel> finduser(RegisterModel model) {
		// TODO Auto-generated method stub
		RegisterDao dao=new RegisterDaoImpl();
		return dao.finduser(model);
	}

}
