<%--
  Created by IntelliJ IDEA.
  User: zuleyhakaya
  Date: 2.01.2019
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
   request.setAttribute("reguestAttribute1","requestAttribute");
    session.setAttribute("sessionAttribute2","sessionAttribute");
    application.setAttribute("applicationAttribute3","applicationAttribute");
    pageContext.setAttribute("pageContext","pageContext");
%>

</body>
</html>
