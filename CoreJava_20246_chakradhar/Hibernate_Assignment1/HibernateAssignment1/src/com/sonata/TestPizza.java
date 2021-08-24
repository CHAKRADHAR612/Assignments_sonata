package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestPizza {

	public static void main(String[] args) {
		SessionFactory f=new Configuration().configure().buildSessionFactory();
		Session s=f.openSession();
		s.beginTransaction();
		User u1=new User();
		u1.setUserId(1);
		u1.setUserName("chakradhar");
		s.save(u1);
		User u2=new User();
		u2.setUserId(2);
		u2.setUserName("prudhvi");
		s.save(u2);
		User u3=new User();
		u3.setUserId(3);
		u3.setUserName("chandra");
		s.save(u3);
		
		Pizza p1=new Pizza();
		p1.setPizzaId(101);
		p1.setPizzaName("Veg Corn");
		s.save(p1);
		Pizza p2=new Pizza();
		p2.setPizzaId(102);
		p2.setPizzaName("Chicken pizza");
		s.save(p2);
		Pizza p3=new Pizza();
		p3.setPizzaId(103);
		p3.setPizzaName("paneer pizza");
		s.save(p3);
		Orders o1=new Orders();
		o1.setUserId(2);
		o1.setPizzaId(102);
		s.save(o1);
		
		Orders o2=new Orders();
		o2.setUserId(3);
		o2.setPizzaId(101);
		s.save(o2);
		
		Orders o3=new Orders();
		o3.setUserId(1);
		o3.setPizzaId(103);
		s.save(o3);
		
		s.getTransaction().commit();
		s.close();
	}

}
