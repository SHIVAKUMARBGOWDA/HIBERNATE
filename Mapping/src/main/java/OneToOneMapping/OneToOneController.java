package OneToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneController
{
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("shiva");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		//Creating question object
		Question q=new Question();
		q.setQid(1);
		q.setQuestion("What is Java?");
		
		//Creating answer object
		Answer a=new Answer();
		a.setAid(1);
		a.setAnswer("Java is a programming language");
		
		//Setting answer to question
		q.setAnswer(a);
		
		//Inserting question and answer objects to database
		transaction.begin();
		manager.persist(q);
		manager.persist(a);
		transaction.commit();
	}

}
