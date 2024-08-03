package com.hrms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

import com.hrms.model.RegisterModel;
import com.hrms.model.Topic;
import com.hrms.service.UserService;
import com.hrms.service.UserServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String uName=request.getParameter("userName");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		long mobileNo=Long.parseLong(request.getParameter("mobileNo"));
		
		String topic=request.getParameter("topic"); 
		HashSet<Topic>topics=new HashSet<Topic>();
		topics.add(new Topic(topic));
		String registerDate=request.getParameter("registerDate");
		String pmailId=request.getParameter("pmailId");
		RegisterModel model=new RegisterModel();
		model.setUserName(uName);
		model.setEmail(email);
		model.setAddress(address);
		model.setMobileNo(mobileNo);
		model.setTopic(topics);
		model.setRegisterDate(registerDate);
		model.setPmailId(pmailId);
		System.out.println(model);
		
		//create a object for navigate service 
		UserService userService=new UserServiceImpl();
		int resisterValue=userService.registerUser(model);
		System.out.println(resisterValue);
		request.getRequestDispatcher("userList.jsp").forward(request, response);
		
		
	}

}
