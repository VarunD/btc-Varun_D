package com.btc.hibernate1;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee-persistence");
    	//JPA 
    	
    	EntityManager emgr = factory.createEntityManager();
    	//Entity manager have direct connection with the database which helps 
    	//in the create, delete and update and save the data...
    	
    	EntityTransaction trnx = emgr.getTransaction();
    	//if we want to make any changes then we need to go through the transaction only..

    	//Insert employee
    	Employee emp = new Employee(5001,"Javed Ali", LocalDate.of(2021, 10, 15), 54000);
    	
    	trnx.begin();
    	emgr.persist(emp);
    	trnx.commit();
    	
 	//	Fetch Employee
    	Employee emp1 = emgr.find(Employee.class, 5001);
    	System.out.println(emp);
    }
}