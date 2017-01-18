package demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.TeamDao;
import demo.domain.SmartEntity;
import demo.domain.Users;

@Service
@Transactional
public class TeamService {
	@Autowired
	private TeamDao teamDao;
	public Users findByName(Long name){
		return teamDao.findOne(name);
	}
	public void save(Users team){
		teamDao.save(team);
	}
}

