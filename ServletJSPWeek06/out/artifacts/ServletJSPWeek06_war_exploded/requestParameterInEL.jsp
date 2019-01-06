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
</head>requestParameterInEL.jsp
<body>
<%-- formu jsp  submit etmek yerine controllere submit ederiz genel yaklasim boyledir--%>

${param.firstName}
${param.lastName}
${param.gender}
${param.gender}
${param.maritalstatus}
${paramValues.lang[0]}
${paramValues.lang[1]}
</body>
</html>
