package demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SmartEntity {
	@Id @GeneratedValue
	Long Id;
	String sKey;
	String name;
	String role;
	
	public SmartEntity() {
		super();
		
	}
	public SmartEntity(String sKey, String name, String role) {
		this.sKey = sKey;
		this.name = name;
		this.role = role;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getsKey() {
		return sKey;
	}


	public void setsKey(String sKey) {
		this.sKey = sKey;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
