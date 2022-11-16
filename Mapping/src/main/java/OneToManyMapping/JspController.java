package OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JspController
{
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("shiva");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		//Creating Jspiders object
		Jspiders j=new Jspiders();
		//Setting values to Jspiders object
		j.setJ_id(1);
		j.setFounder("Ram");
		
		//Creating Branch Object
		Branch b1=new Branch();
		b1.setId(1);
		b1.setLocation("Hebbal");
		
		//Creating another Branch Object
		Branch b2=new Branch();
		b2.setId(2);
		b2.setLocation("RajajiNagar");
		
		//Creating list to store Branches
		List<Branch> branches=new ArrayList<Branch>();
		
		//Adding branches to the list
		branches.add(b1);
		branches.add(b2);
		
		//Setting the branch list to Jspiders
		j.setB(branches);
		
		//Insert object to database
		transaction.begin();
		manager.persist(j);
		manager.persist(b1);
		manager.persist(b2);
		transaction.commit();
		
	}

}
