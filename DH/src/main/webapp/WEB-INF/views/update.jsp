<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<script>

</script>
<body>
<h1>회원관리 수정관리자</h1>
<form action = "afterUpdate">
    Id <input type = "text" name = "id" value = <%=request.getParameter("id")%>>
    Pw <input type = "text" name = "pw" value = <%=request.getParameter("pw")%>>
    name  <input type = "text" name = "name" value =<%=request.getParameter("name")%>>
    point <input type = "text" name = "point" value =<%=request.getParameter("point")%>>
    <input type = "submit"  value = "작성완료">
    <input type = "hidden" name = "choice" value = <%=request.getParameter("id")%>>
</form>
</body>
</html>
