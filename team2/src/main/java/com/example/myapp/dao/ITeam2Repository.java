package com.example.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.myapp.model.Team2VO;

@Repository
@Mapper
public interface ITeam2Repository {
	void createTeam(Team2VO team2);
	List<Team2VO> selectAllTeam();
	void deleteTeam(int teamno);
	void updateTeam(Team2VO team2);

}
