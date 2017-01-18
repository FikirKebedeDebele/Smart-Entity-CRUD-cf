package demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import demo.domain.SmartEntity;
import demo.domain.Users;

public interface TeamDao extends CrudRepository <Users,Long>{
	
	

}
