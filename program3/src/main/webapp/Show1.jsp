<%@page import="java.time.LocalDateTime"%>
<html>
<body>
<%-- 
<%=session.getAttribute("employee") %>
 <h2>Hello <span style="color:blue"><%=request.getParameter("empName") %></span></h2>
<h2>name is <span style="color:blue"><%=request.getParameter("empName") %></span></h2>
<h2>id is <span style="color:blue"><%=request.getParameter("empId1") %></span></h2>
<h2>sal is <span style="color:blue"><%=request.getParameter("empSalary1") %></span></h2>

<%
for(int i=1;i<=10;i++)
{
	out.println("<p>Hello :"+i+"</p>");
}
%>
<%=
message()
%>
<%!
 m mpublic String message()
{
	return "Hello to all of you";
}
%>
 <%=session.getAttribute("login") %>
  --%>
  <%-- 


<%=session.getAttribute("employee") %>
--%>
<%= request.getAttribute("username") %>
<%= request.getAttribute("ageOf") %>
</body>
</html>