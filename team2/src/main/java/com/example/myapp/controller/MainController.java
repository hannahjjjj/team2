package com.example.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@Autowired
	ITeam2Service Team2Service;
	
	@RequestMapping("/")
	public String main() {
		return"index";
	}
	
	
	
	
	
//	@RequestMapping(value = "/delete", method=RequestMethod.GET)
//	public int deleteTeam() {
//		
//		return 0;
//	}
//	
//	@RequestMapping(value = "/delete", method=RequestMethod.POST)
//	public int deleteTeam() {
//		
//		return 0;
//	}
//	

}
