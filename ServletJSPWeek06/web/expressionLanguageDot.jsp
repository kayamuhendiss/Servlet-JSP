<%--
  Created by IntelliJ IDEA.
  User: zuleyhakaya
  Date: 3.01.2019
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>${myMap.key1} </p>
    <p>${myMap.key2} </p>
    <p>${myMap.key3} </p>
    <p>${myMap.key4} </p> <!-- null yazmaz bostur  HATA VERMIYOR-->

    <p>${noMap.key4} </p> <!-- hata vermez -->
</body>
</html>
