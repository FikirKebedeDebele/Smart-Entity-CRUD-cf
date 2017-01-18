package demo.dao;

import org.springframework.data.repository.CrudRepository;

import demo.domain.SmartEntity;
import demo.domain.Users;

public interface UserDao extends CrudRepository <Users,Long>{

}
