<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
</head>

<%if(request.getAttribute("msg")!=null){ %>
<script>
	alert('${msg}')
	location.href = "first"
</script>
<%} %>
<body>

</body>
</html>
