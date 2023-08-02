package com.example.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.myapp.dao.ITeam2Repository;
import com.example.myapp.model.Team2VO;

public class Team2Service implements ITeam2Service {
	
	@Autowired
	ITeam2Service teamService;
	
	@Autowired
	ITeam2Repository team2Repository;
	
	
	@Override
	public void createTeam(Team2VO team2) {
		teamService.createTeam(team2);
	}

	@Override
	public void deleteTeamContent(int teamno) {
		team2Repository.deleteTeam(teamno);
		
	}




}
