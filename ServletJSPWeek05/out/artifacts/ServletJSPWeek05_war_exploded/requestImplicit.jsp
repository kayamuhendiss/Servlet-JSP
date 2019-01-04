<%@ page import="_03.jspaction.model.Person" %><%--
  Created by IntelliJ IDEA.
  User: zuleyhakaya
  Date: 3.01.2019
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%Person personn= (Person) request.getAttribute("myAttribute");
%>
<%=personn.getName()%>
<%=personn.getSurname()%>
<%=personn.getAge()%>

<jsp:useBean id="myAttribute" class="_03.jspaction.model.Person" scope="request">
    <jsp:getProperty name="myAttribute" property="name"/>
    <jsp:getProperty name="myAttribute" property="surname"/>
    <jsp:getProperty name="myAttribute" property="age"/>

</body>
</html>
