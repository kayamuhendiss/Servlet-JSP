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
<p>
    <%=request.getAttribute("reguestAttribute1")%>
    <%=session.getAttribute("sessionAttribute2")%>
    <%=application.getAttribute("applicationAttribute3")%>
    <%=pageContext.getAttribute("pageContext")%>
</p>
</body>
</html>
