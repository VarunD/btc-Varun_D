package program3;

	import java.io.IOException;
	import java.io.PrintWriter;
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	@WebServlet(urlPatterns = "/hello")
	public class first  extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		 
//		String empname = request.getParameter("empname");
//	     String empid = request.getParameter("empid");
//	    
//	     int id=Integer.parseInt(empid);
//	     String empsal = request.getParameter("empsal");
//	     
//	     double sal=Double.parseDouble(empsal);
//	     Employeee emp=new Employeee(empname,id,sal);
//	   
//	     System.out.println(emp);
//	  
//	     HttpSession session = request.getSession();
//	     session.setAttribute("employee", emp);
	     
	    
//		String name = "Mr./Ms. "+request.getParameter("tname");
//		String name1 = request.getParameter("aaname");
//		int id = Integer.parseInt(name1);
		
//		String empName = "mr/ms" +request.getParameter("empname");
//		request.setAttribute("employeeName", empName);
//		
//		String empId = "mr/ms" +request.getParameter("empid");
//		int empId1 = Integer.parseInt(empId);
//		request.setAttribute("employeeId", empId1);
//		
//		
//		String empSalary = "mr/ms" +request.getParameter("empsal");
//		int empSalary1 = Integer.parseInt(empSalary);
//		request.setAttribute("employeeName", empSalary1);
//		
//	    RequestDispatcher rd = request.getRequestDispatcher("show1.jsp");
//	     
//	     rd.forward(request, response);
		
		String name= request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		
		 request.setAttribute("username", name);
		 request.setAttribute("ageOf", age);
		 RequestDispatcher rd = request.getRequestDispatcher("Show1.jsp");
		 rd.forward(request, response); 
		 
		
		};
	}
