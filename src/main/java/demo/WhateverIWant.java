package demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.SmartEntity;
import demo.domain.Users;
import demo.service.TeamService;

@RestController
public class WhateverIWant {
	
	@Autowired TeamService teamService;
	@PostConstruct
	public void init()
	{
		Set<SmartEntity> smartEntity = new HashSet<>();
		smartEntity.add(new SmartEntity("0ff042ea-45e6-32e1-915b-81efa58e924e","QFC", "Buyer"));
		
		Users team = new Users();
		team.setUsers(smartEntity);
		teamService.save(team);
	}
	@RequestMapping("/teams/{id}")
	public Users hiThere(@PathVariable Long id)
	{
	
		return teamService.findByName(id);
	}

}
