package OneToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Jspiders
{
	@Id
	private int j_id;
	private String founder;
	
	@OneToMany
	List<Branch> b;

	public int getJ_id() {
		return j_id;
	}
	public void setJ_id(int j_id) {
		this.j_id = j_id;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public List<Branch> getB() {
		return b;
	}
	public void setB(List<Branch> b) {
		this.b = b;
	}
}
