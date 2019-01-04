<%@ page import="_03.jspaction.model.Person" %>
<%--
  Created by IntelliJ IDEA.
  User: zuleyhakaya
  Date: 2.01.2019
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person personObj= (Person) request.getAttribute("myPerson");
%>
<%=personObj.getName()%>
<%=personObj.getSurname()%>
<%=personObj.getAge()%>
</body>

</html>
