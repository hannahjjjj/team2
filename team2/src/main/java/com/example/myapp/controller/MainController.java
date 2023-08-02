package com.example.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.myapp.service.ITeam2Service;

@Controller
public class MainController {

	@Autowired
	ITeam2Service teamService;
	
	@RequestMapping("/")
	public String main() {
		return"index";
	}
	
	
	
	
	
	@RequestMapping(value = "/delete", method=RequestMethod.GET)
	public void deleteTeam() {
		
	}
	
	@RequestMapping(value = "/delete", method=RequestMethod.POST)
	public int deleteTeam(int teamno) {
		
		
		teamService.deleteTeamContent(teamno);
		return teamno;
	}
	

}
