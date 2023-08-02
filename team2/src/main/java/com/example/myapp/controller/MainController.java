package com.example.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.myapp.model.Team2VO;
import com.example.myapp.service.ITeam2Service;
import com.example.myapp.service.Team2Service;

import lombok.RequiredArgsConstructor;


@Controller
public class MainController {
	@Autowired
	ITeam2Service teamService;
	
	@RequestMapping("/")
	public String main() {
		return"index";
	}
	@RequestMapping(value="/create" , method=RequestMethod.GET)
	public String createteam(Model model) {
		List<Team2VO> teamList = teamService.selectAllTeam();
//		teamList.stream().forEach((t) -> {
//			System.out.println(t.getTeamname());
//		});
		model.addAttribute("teamList", teamList);
		return "index";
	}
	
	@RequestMapping(value="/create" , method=RequestMethod.POST)
	public String createteam(Model model, Team2VO team) {
		try {
		team.setTeamno(team.getTeamno());
		team.setTeamname(team.getTeamname());
		team.setTeamage(team.getTeamage());
		teamService.createTeam(team);
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return"index";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateteam(Model model) {
		List<Team2VO> teamList = teamService.selectAllTeam();
		model.addAttribute("teamList", teamList);
		return"update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateteam(Model model, Team2VO team2) {
		teamService.updateTeam(team2);
		model.addAttribute("team2", team2);
		return "update";
	}
	
	
	
	@RequestMapping(value = "/delete", method=RequestMethod.GET)
	public void deleteTeam() {
		
	}
	
	@RequestMapping(value = "/delete", method=RequestMethod.POST)
	public int deleteTeam(int teamno) {
		
//		
//		teamService.deleteTeamContent(teamno);
		return teamno;
	}
	
}
