package demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Users {
	@Id @GeneratedValue
	Long Id;
	@OneToMany(cascade =CascadeType.ALL)
	Set<SmartEntity> smartEntity;
	
	public Users() {
		super();
		
	}

	public void setId(Long id) {
		Id = id;
	}

	public Set<SmartEntity> getSmartEntity() {
		return smartEntity;
	}

	public void setUsers(Set<SmartEntity> smartEntity) {
		this.smartEntity = smartEntity;
	}
	
	

}
