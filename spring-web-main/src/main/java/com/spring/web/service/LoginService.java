package com.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.web.model.Login;
import com.spring.web.repository.LoginRepository;

@Service
public class LoginService {

	public Login userid;
	@Autowired
	private LoginRepository loginrepo;
	
	public String adduser(Login login)
	{
		Login log = new ObjectMapper().convertValue(login, Login.class);
		userid = loginrepo.save(log);
		System.out.println(userid);
		return null;
	}
	
	public String check(String username, String password)
	{
		List<Login> users = loginrepo.findAll();
		System.out.println(users);
		int n = users.size();
		
		for(int i=0;i<n;i++)
		{
			Login u = users.get(i);
			if(u.getUsername().equals(username))
			{
				System.out.println("Valid username");
				if(u.getPassword().equals(password))
				{
					System.out.println("Valid password");
					return "got";
				}
				else
				{
					System.out.println("Invalid password");
				}
			}
		}
		return "user not found";
	}
}
