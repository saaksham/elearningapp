package com.tuta.ProjectwithMavenFinal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	
	{
	    public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        
	        Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	     SessionFactory  factory=cfg.buildSessionFactory();
	     Session session=factory.openSession();
Student student=(Student)session.get(Student.class,106);
System.out.println(student);

}
}