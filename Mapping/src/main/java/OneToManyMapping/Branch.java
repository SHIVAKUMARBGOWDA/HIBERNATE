package OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch 
{
	@Id
	private int id;
	private String location;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
