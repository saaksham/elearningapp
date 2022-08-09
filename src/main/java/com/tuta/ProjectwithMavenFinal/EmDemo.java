package com.tuta.ProjectwithMavenFinal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		  
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
     SessionFactory  factory=cfg.buildSessionFactory();
	
	Student s1=new Student();
	s1.setId(1234);
	s1.setName("radha");
	s1.setCity("lucknow");
	
	Certificate certi=new Certificate();
	certi.setCourse("Android");
	certi.setDuration("2 month");
	
	
	s1.setCerti(certi);
	
	  Session session= factory.getCurrentSession();
	   
	  Transaction tx=  session.beginTransaction();
	    
	    session.save(s1);
	    
	    
	    
	   tx.commit();
	
	
	
	factory.close();
	}

}
