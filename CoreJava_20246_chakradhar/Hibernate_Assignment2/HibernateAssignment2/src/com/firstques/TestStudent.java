package com.firstques;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class TestStudent {

	public static void main(String[] args) {
		SessionFactory f=new Configuration().configure().buildSessionFactory();
		Session s=f.openSession();
		s.beginTransaction();
		Criteria crt=s.createCriteria(Student.class);
//		crt.setProjection(Projections.max("marks")); 	a
		List<Student> stds=crt.list();
//		Query q=s.createQuery("from Student WHERE marks BETWEEN 80 AND 90"); c
//		Query q=s.createQuery("from Student WHERE stdName LIKE 's%'");	d
//		Query q=s.getNamedQuery("getElementBy.Marks");
//		List<Student> stds=q.list();
		s.getTransaction().commit();
		s.close();
		System.out.println(stds);
	}

}
