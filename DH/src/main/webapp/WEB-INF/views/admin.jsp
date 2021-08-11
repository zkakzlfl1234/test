<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<script>

</script>
<body>
<h1>회원관리</h1><br/>
<button onclick = "location.href = 'first'">로그인</button><br/>
<br/>
<br/>
<c:forEach var="m" items="${list}">
<form action = "update">
	ID : ${m.id}<br/>
	PW : ${m.pw}<br/>
	name : ${m.name}<br/>
	point : ${m.point}<br/>
	<input type = "hidden" name = "id" value = ${m.id}>
    <input type = "hidden" name = "pw" value = ${m.pw}>
    <input type = "hidden" name = "name" value = ${m.name}>
    <input type = "hidden" name = "point" value = ${m.point}>
	<button onclick="location.href='update?id=${m.id}'">수정</button>
</form>	
	<button onclick="location.href='delete?id=${m.id}'">삭제</button><br/>
</c:forEach><br/>
</body>
</html>
