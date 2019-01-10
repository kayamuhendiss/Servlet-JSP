<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jQuery, Ajax and Servlet/JSP integration example</title>

<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>

<script src="js/ajaxQuery.js" type="text/javascript"></script>
</head>
<body>

	<form>
		Enter Your Name: <input type="text" id="firstname" onchange="sendAjaxQuery()" />
	</form>

	<strong>Ajax Response</strong>:
	<div id="ajaxGetUserServletResponse"></div>
</body>
</html>