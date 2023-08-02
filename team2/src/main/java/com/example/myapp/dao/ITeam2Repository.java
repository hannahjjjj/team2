package com.example.myapp.dao;

import com.example.myapp.model.Team2VO;

public interface ITeam2Repository {
	void createTeam(Team2VO team2);

	void deleteTeam(int teamno);
	
}
