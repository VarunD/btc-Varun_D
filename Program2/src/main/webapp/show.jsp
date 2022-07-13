
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.time.LocalDateTime" %>
<html>
<body>
<h2>Hello <span style="color:grey"> <%=application.getAttribute("username")%></span> </h2>
<h2>Hello <span style="color:blue"> <%=application.getAttribute("usernamee")%></span> </h2>
<--
<h2> world <span style="color:green"> <%= request.getAttribute("username1") %></span></h2>
<h2> Happy <span style="color:yellow"> <%= request.getAttribute("username2") %> </span></h2>

<h2>Hello <span style="color:red"> <%=request.getAttribute("username1")%></span> </h2>
<h2>Hello <span style="color:blue"> <%=request.getAttribute("username2")%></span> </h2>


<%
for(int i=1;i<=10;i++)
{
	out.println("<p>Hello : "+LocalDateTime.now()+"</p>");
}
%>
<%=getMessage()%>

<%!
public String getMessage(){
	return "Hey there, this is an example of JSP Declaration";
}
%>

 <%= session.getAttribute("login") %>
 
 <%= session.getAttribute("login") %>

${login}

<%= request.getAttribute("sum") %>
${sum1}

</body>
</html>