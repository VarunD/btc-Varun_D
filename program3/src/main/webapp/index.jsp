<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>
<%-- 
<form name="employeeDetails" method="post" action="hello">
    Employeename: <input type="text" name="empname"/> <br/>
    Employeeid: <input type="number" name="empid"/> <br/>
    Employeesal: <input type="text" name="empsal"/> <br/>
    <input type="submit" value="submit" />
</form>
--%>


<form action="hello" method="get">
<p> Enter the name <input type="text" name="username"> </p>
<p> Enter the age <input type="number" name="age"> </p>
<button type="submit">enter</button>


</form>
</body>
</html>