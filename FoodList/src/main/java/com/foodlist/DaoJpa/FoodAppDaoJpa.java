package com.foodlist.DaoJpa;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.foodlist.FoodApp.FoodApp;
import com.mysql.cj.Query;

public class FoodAppDaoJpa 
{
	EntityManagerFactory factory;
	EntityManager emgr;
	EntityTransaction trnx;

public FoodAppDaoJpa() 
{	
	factory= Persistence.createEntityManagerFactory("FoodApp-persistence");
	emgr = factory.createEntityManager();
	trnx = emgr.getTransaction();
}
	public FoodApp addNew(FoodApp foodapp)
	{	
	emgr.persist(foodapp);	
	return foodapp;
	}
	
	public boolean deleteItem(long itemid)throws SQLException 
	{	
		FoodApp food = emgr.find(FoodApp.class, itemid);
		trnx.begin();
		emgr.remove(food);
		trnx.commit();
		return false;
	}
	
	public FoodApp updateItem(FoodApp foodapp,long itemid)
	{
		trnx.begin();
		FoodApp food = emgr.find(FoodApp.class , itemid);
		food.setItemname("idli");
		food.setCategory("morning breakfast");
		food.setPrice(30);
		trnx.commit();
		return food;
	}

	public  FoodApp searchItem(String name)
	{	
		Query searchItem = (Query) emgr.createQuery("from FoodApp where itemname: itemname");
		((javax.persistence.Query) searchItem).setParameter("itemname" , name);
		FoodApp food = (FoodApp) ((javax.persistence.Query) searchItem).getSingleResult();
		return food;
	}

	public  FoodApp displayitem()
	{	
		javax.persistence.Query query1 = emgr.createQuery("from FoodApp");
		List<FoodApp> foodList = ((javax.persistence.Query) query1).getResultList();
		return (FoodApp) foodList;
	}
	
	public FoodApp filterItem(String category) throws SQLException
	{	
		
			return null;	
	}
}
