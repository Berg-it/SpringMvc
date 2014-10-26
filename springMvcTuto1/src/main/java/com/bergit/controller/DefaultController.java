package com.bergit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.bergit.jpa.model.User;
import com.bergit.jpa.service.UserJARService;



@Controller
@RequestMapping(DefaultController.CONTROLLER_BASE_PATH)
public class DefaultController {
	public final static String CONTROLLER_BASE_PATH 			= "/hello";

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	UserJARService userJARService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String showListOfUser()
	{
		System.out.println("---*************************************---");
	
		User  user1= userJARService.getUserDetails("1");
		
	//String json = restTemplate.getForObject("http://localhost:8081/myProjectWebServiceArtifactId/hello/1", String.class);
	System.out.println("RESULTAT  "+user1.getLastname());
	
		return "index";
	}
	
	
	
	
}
