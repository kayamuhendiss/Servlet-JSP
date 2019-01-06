<%--
  Created by IntelliJ IDEA.
  User: zuleyhakaya
  Date: 3.01.2019
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>${myEmployeeAttribute.id}</p>
<p>${myEmployeeAttribute.name}</p>
<p>${myEmployeeAttribute.salary}</p>
<p>${myEmployeeAttribute.department.id}</p>
<p>${myEmployeeAttribute.department.name}</p>


<h1>bracket</h1>
<p>${myEmployeeAttribute['id']}</p>
<p>${myEmployeeAttribute['name']}</p>
<p>${myEmployeeAttribute["salary"]}</p>
<p>${myEmployeeAttribute['department']['id']}</p>
<p>${myEmployeeAttribute['department']['name']}</p>



</body>
</html>
