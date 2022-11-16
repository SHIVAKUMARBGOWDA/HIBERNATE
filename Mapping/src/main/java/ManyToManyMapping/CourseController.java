package ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CourseController 
{
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("shiva");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		//Creating student 1 object
		Students s1=new Students();
		s1.setId(1);
		s1.setName("Shivakumar");
		
		//Creating student 2 object
		Students s2=new Students();
		s2.setId(2);
		s2.setName("Ram");
		
		//Storing multiple students in list
		List<Students> students=new ArrayList<Students>();
		students.add(s1);
		students.add(s2);
		
		//Creating course 1
		Courses c1=new Courses();
		c1.setId(1);
		c1.setSubject("Java");
		c1.setFees(30000);
		//Setting student list to course 1
		c1.setStudents(students);
		
		//Creating course 2
		Courses c2=new Courses();
		c2.setId(2);
		c2.setSubject("J2EE");
		c2.setFees(30000);
		//Setting student list to course 1
		c2.setStudents(students);
		
		//Creating list to store all courses
		List<Courses> courses=new ArrayList<Courses>();
		courses.add(c1);
		courses.add(c2);
		
		//Setting course list to Student s1
		s1.setCourse(courses);
		//Setting course list to Student s2
		s2.setCourse(courses);
		
		transaction.begin();
		manager.persist(s1);
		manager.persist(s2);
		manager.persist(c1);
		manager.persist(c2);
		transaction.commit();
		
	}
}
