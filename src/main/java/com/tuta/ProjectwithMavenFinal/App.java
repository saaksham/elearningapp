package com.tuta.ProjectwithMavenFinal;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
     SessionFactory  factory=cfg.buildSessionFactory();
     
    Student st=new Student();
    st.setId(101);
    st.setName("John");
    st.setCity("haridwar");
    
    Address ad=new Address();
    ad.setStreet("street1");
    ad.setCity("DELHI");
    ad.setOpen(true);
    ad.setAddedDate(new Date());
    ad.setX(123.123);
    
    System.out.println(st);
    
   Session session= factory.getCurrentSession();
   
 Transaction tx=  session.beginTransaction();
   
   session.save(st);
   session.save(ad);
   
   
  tx.commit();
   
   
   session.close();
    
     
     
     
     
    
     
     
     
    
    
    
    
    }
}
