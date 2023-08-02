package com.example.myapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.myapp.model.Team2VO;

@Repository
public class Team2Repository implements ITeam2Repository {
	
	@Autowired
	ITeam2Repository teamRepository;

	@Override
	public void createTeam(Team2VO team2) {
		teamRepository.createTeam(team2);		
	}

}
