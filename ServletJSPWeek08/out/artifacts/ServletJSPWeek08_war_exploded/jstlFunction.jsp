<%--
  Created by IntelliJ IDEA.
  User: zuleyhakaya
  Date: 7.01.2019
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>${fn:toUpperCase("java")} </p>
<p>${fn:indexOf("test content abc", "content")}</p>
<c:set var="myattribute" value="injavawetrust" />

<p>${fn:substring(myattribute, 2, 6)}</p>

</html>
