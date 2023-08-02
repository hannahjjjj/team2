package com.example.myapp.service;

import java.util.List;



import com.example.myapp.model.Team2VO;


public interface ITeam2Service {
	void createTeam(Team2VO team2);
	List<Team2VO> selectAllTeam();
	void deleteTeamContent(Team2VO team2);
	void updateTeam(Team2VO team2);

}
