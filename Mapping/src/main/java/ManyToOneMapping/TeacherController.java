package ManyToOneMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TeacherController
{
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("shiva");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Teacher t=new Teacher();
		
		t.setT_id(1);
		t.setT_name("Rahul");
		t.setSubject("Core Java");
		
		Student s1=new Student();
		
		s1.setS_id(1);
		s1.setS_name("Shiva");
		
		Student s2=new Student();
		s2.setS_id(2);
		s2.setS_name("Prabhu");
		
		List<Student> students=new ArrayList<Student>();
		
		//Adding students to the list
		students.add(s1);
		students.add(s2);
		
		//setting the srudents to teacher
		s1.setT(t);
		s2.setT(t);
		
		//Inserting objects to database
		transaction.begin();
		manager.persist(t);
		manager.persist(s1);
		manager.persist(s2);
		transaction.commit();
	}
}
