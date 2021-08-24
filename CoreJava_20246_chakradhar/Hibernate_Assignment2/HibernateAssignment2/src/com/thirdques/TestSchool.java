package com.thirdques;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSchool {

	public static void main(String[] args) {
		Student s1=new Student();
		SchoolDetails scd=new SchoolDetails();
		scd.setSchoolAddress("Bangalore");
		scd.setPublic(true);
		scd.setStudentCount(50);
		s1.setSd(scd);
		s1.setStdName("chakradhar");
		s1.setStdAddress("Raahmundry");
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		s.beginTransaction();
		s.save(s1);
		s.getTransaction().commit();
		s.close();
	}

}
