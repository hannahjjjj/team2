package com.example.myapp.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dao.ITeam2Repository;
import com.example.myapp.model.Team2VO;

@Service
public class Team2Service implements ITeam2Service {
	
	@Autowired
	ITeam2Repository teamRepository;
	
	@Override
	public void createTeam(Team2VO team2) {
		teamRepository.createTeam(team2);
	}

	@Override
	public List<Team2VO> selectAllTeam() {
		return teamRepository.selectAllTeam();
	}

}
