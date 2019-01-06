<%--
  Created by IntelliJ IDEA.
  User: zuleyhakaya
  Date: 4.01.2019
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- formu jsp  submit etmek yerine controllere submit ederiz genel yaklasim boyledir--%>

${cookie.username.value}
<%-- birisi jsp implicit obje --%>
<%=request.getMethod()%>
${pageContext.request.method}
<%=request.getHeader("host")%>
${header.host}

${myAttribute}
${requestScope.myAttribute}
${sessionScope.myAttribute}

</body>
</html>
