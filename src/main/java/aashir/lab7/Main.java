package aashir.lab7;

public class Main {

	public static void main(String[] args) {
		//ArrayList<Employee> newEmployee = new ArrayList<Employee>();
		
		Person p1 = new Person();
		p1.setId(1);
		p1.setname("Aashir");
		p1.setFather_name("Sohial");
		p1.setOrganization("NUST");
		p1.setMobile("03425636673");
		
		PersonFactory per = new PersonFactory();
		per.save(p1);
		per.print();
		
		per.closeSession();
		
		
	}
}

