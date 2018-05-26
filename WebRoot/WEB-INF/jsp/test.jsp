<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试页面</title>
<link rel="stylesheet" href="css/test.css" />
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/test.js"></script>
</head>
<body>
	<span class="test_span">
		<c:forEach items="${itemList }" var="item">
			<p>${item.id} : ${item.name }</p>
		</c:forEach>
	</span>
	<input type="button" value="变蓝" onclick="changeToBlue();"/>
</body>
</html>