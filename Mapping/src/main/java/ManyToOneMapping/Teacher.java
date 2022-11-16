package ManyToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher 
{
	@Id
	private int t_id;
	private String t_name;
	private String subject;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	

}
