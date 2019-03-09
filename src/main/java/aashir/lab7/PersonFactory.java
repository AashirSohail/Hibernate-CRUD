package aashir.lab7;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class PersonFactory {

	public Session currSession = null;
	
	public PersonFactory() {
		SessionCreator.createSessionFactory();
		currSession = SessionCreator.getSessionFactory().openSession();
	}
	
	public void closeSession() {
		currSession.close();
	}
	
	public void save(Person newPer) {
		System.out.println("Adding record into database...");
		Transaction t = currSession.beginTransaction();
		currSession.save(newPer);
		t.commit();
		System.out.println("Record successfully added.");
	}
	
	public void print() {
		Query<Person> q = currSession.createQuery("FROM Person");
		List<Person> list = q.list();
		
		Iterator<Person> itr = list.iterator();
		while (itr.hasNext()) {
			Person per = itr.next();
			System.out.println("Id: " + per.getId());
			System.out.println("Name: " + per.getname());
			System.out.println("Father Name: " + per.getFather_name());
			System.out.println("Organization: " + per.getOrganization());
			System.out.println("Mobile: " + per.getMobile());
		}
	}
}

