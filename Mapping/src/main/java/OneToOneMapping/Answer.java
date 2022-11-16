package OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer 
{
	@Id
	private int aid;
	private String answer;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
