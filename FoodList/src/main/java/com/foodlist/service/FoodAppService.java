package com.foodlist.service;


import java.sql.SQLException;

import com.foodlist.DaoJpa.*;
import com.foodlist.FoodApp.*;
public class FoodAppService
{
	 private FoodAppDaoJpa dao;
	 
	 public  FoodAppService() 
	 {
		 dao=new FoodAppDaoJpa();
	 }
	 public FoodApp addItem(FoodApp foodapp) {
		 return dao.addNew(foodapp);
	 }
	 public boolean delteItem(long itemid) throws SQLException 
	 {	
			return dao.deleteItem(itemid);
	}
	public FoodApp updateItem(FoodApp foodapp,long itemid) throws SQLException 
	{
		return dao.updateItem(foodapp, itemid);
	}

	public FoodApp searchItem(String name) throws SQLException 
	{	
		return dao.searchItem(name);
	}
		public FoodApp displayitem() throws SQLException 
		{	
			return dao.displayitem();
		}
		public FoodApp filterItem(String category) throws SQLException 
		{	
			return dao.filterItem(category);
		}
	 
	}
