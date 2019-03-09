package aashir.lab7;

import javax.imageio.spi.ServiceRegistry;
import javax.security.auth.login.Configuration;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionCreator {
	
	
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	public static void createSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
		
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}

