package com.foodlist.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.Model.FoodApp;
import com.foodApp.Service.FoodAppService;


@WebServlet(urlPatterns = "/FoodApp")
public class FoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FoodAppService service;
    public FoodController() {
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
		service=new FoodAppService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FoodApp varFood=null;
		try {
			varFood=service.displayitem();
			request.setAttribute("newitem",varFood);
			request.getRequestDispatcher("FoodDetail.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	long menuItem =Long.parseLong(request.getParameter("menuid"));
	String itemname =request.getParameter("itemname");
	String status=request.getParameter("status");
	double price=Double.parseDouble(request.getParameter("price"));
	String category=request.getParameter("category");
	FoodApp food=new FoodApp(menuItem, itemname,status, price, category);
	FoodApp varFood=null;
	varFood=service.addItem(food);
	request.setAttribute("newitem",varFood);
	request.getRequestDispatcher("FoodDetail.jsp").forward(request, response);
	
	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

}
	public void deleteitem (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		long id=Long.parseLong(request.getParameter("removeId"));
		try {
			boolean status=service.delteItem(id);
			request.setAttribute("newitem",status);
			request.getRequestDispatcher("FoodDetail.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void search (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException  {
		String itemname =request.getParameter("itemname");
		FoodApp varFood=null;
		varFood=service.searchItem(itemname);
		request.setAttribute("newitem",varFood);
		request.getRequestDispatcher("FoodDetail.jsp").forward(request, response);
}
	
	public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
//for update is done on id and all data is changed
		long menuItem =Long.parseLong(request.getParameter("updateid"));
		String itemname =request.getParameter("updatename");
		String status=request.getParameter("updatestatus");
		double price=Double.parseDouble(request.getParameter("updateprice"));
		String category=request.getParameter("updatecategory");
		FoodApp food=new FoodApp(menuItem, itemname,status, price, category);
		FoodApp varFood=null;
		varFood=service.updateItem(food,menuItem);
		request.setAttribute("newitem",varFood);
		request.getRequestDispatcher("FoodDetail.jsp").forward(request, response);
		
		
	}
	public void display (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		FoodApp varFood=null;
		varFood=service.displayitem();
		request.setAttribute("newitem",varFood);
		request.getRequestDispatcher("FoodDetail.jsp").forward(request, response);
	}
	
	
}
