<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>로그인</h1>
<form action = "main">
	ID <input type = "text" name = "id"><br/>
	PW <input type = "password" name = "pw"><br/>
	<input type = "submit" value = "로그인"><br/>
</form>
	<button onclick = "location.href='insert'">회원가입</button>
</body>
</html>
