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
<jsp:useBean id="myEmployeeAttribute" class="_01.model.Employee" scope="request"/>
<jsp:getProperty name="myEmployeeAttribute" property="id"/>
<jsp:getProperty name="myEmployeeAttribute" property="name"/>
<jsp:getProperty name="myEmployeeAttribute" property="salary"/>

<jsp:getProperty name="myEmployeeAttribute" property="department"/>
<%--  ciktisi bu sekilde olur _01.model.Department@df5637b --%>
<%-- cunku jsp bu yaklasimda tek bir derinlige inebiliyoruz--%>
<%-- <jsp:getProperty name="myEmployeeAttribute" property="department.id"/>--%>
<%-- <jsp:getProperty name="myEmployeeAttribute" property="department.name"/>--%>
<%--gibi bi mantikla bi kat daha derinlige inemeyiz.ic ice property alanina erisim saglayamayiz--%>
<%--Demekki bu noktada jspuseBean yetersiz kalmakta--%>

</body>
</html>
