
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/hello")
public class AppController extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String name = "Mr./Ms. "+request.getParameter("tname");
		String name1 = request.getParameter("aaname");
		int id = Integer.parseInt(name1);

		request.setAttribute("username1", name);
		request.setAttribute("username2", id);
		
		
		ServletContext context2 = request.getServletContext();
		ServletContext context = request.getServletContext();
		ServletContext context1 = request.getServletContext();
		context.setAttribute("username", name);
		context.setAttribute("usernamee", id);

		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		 //Defines an object that receives requests from the client and 
		 //sends them to any resource (such as a servlet, HTML file, or JSP file)
		 //on the server.

		PrintWriter out = response.getWriter();// this is used to execute
		// and acts a  sop.
		out.println("hello hiii");
		HttpSession session = request.getSession();

//		out.println("hello world");
		session.setAttribute("login", "manish@yao.cooom");
		session.setMaxInactiveInterval(60);
		rd.forward(request, response);

//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Hello-World</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h2>");
//		out.println("Hello " + name);
//		out.println("</h2>");
//		out.println("</body>");
//		out.println("</html>");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		int a= Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		 
		int sum=a+b;
		
		HttpSession session = request.getSession();
		session.setAttribute("sum1", sum);
		
		request.setAttribute("sum", sum);
		request.getRequestDispatcher("show.jsp").forward(request, response);	
		
	}
}