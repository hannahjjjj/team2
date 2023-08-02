package com.example.myapp.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.example.myapp.model.Team2VO;

@Service
@Mapper
public interface ITeam2Service {
	void createTeam(Team2VO team2);

	void deleteTeamContent(int teamno);




}
