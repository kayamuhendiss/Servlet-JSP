<%@ page import="_01.model.Employee" %><%--
  Created by IntelliJ IDEA.
  User: zuleyhakaya
  Date: 3.01.2019
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- Bu sekilde yazmak yerine <jsp:useBean></jsp:useBean> kullanalim --%>
<%=((Employee)request.getAttribute("myEmployeeAttribute")).getId()%>
<%=((Employee)request.getAttribute("myEmployeeAttribute")).getName()%>
<%=((Employee)request.getAttribute("myEmployeeAttribute")).getSalary()%>
<%=((Employee)request.getAttribute("myEmployeeAttribute")).getDepartment().getId()%>
<%=((Employee)request.getAttribute("myEmployeeAttribute")).getDepartment().getName()%>
</body>
</html>
