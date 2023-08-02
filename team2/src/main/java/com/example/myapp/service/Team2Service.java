package com.example.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.myapp.model.Team2VO;

public class Team2Service implements ITeam2Service {
	
	@Autowired
	ITeam2Service teamService;
	
	@Override
	public void createTeam(Team2VO team2) {
		teamService.createTeam(team2);
	}

}
