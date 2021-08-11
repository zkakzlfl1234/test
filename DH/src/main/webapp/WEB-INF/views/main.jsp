<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<script>

</script>
<body>
Id : ${id}<br/>
${name}님 안녕하세요<br/>
Point : ${point}<br/>
<button onclick = "location.href = 'logout'">로그아웃</button>

</body>
</html>
