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
<jsp:useBean id="myPerson" class="_03.jspaction.model.Person" scope="request"/>
    <jsp:getProperty name="name" property="myPerson"/>
    <jsp:getProperty name="surname" property="myPerson"/>
    <jsp:getProperty name="age" property="myPerson"/>



</body>

</html>
