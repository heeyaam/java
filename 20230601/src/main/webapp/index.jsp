<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--EL 표현식: 문자열 출력가능, 사칙연산과 관계연산이 끝!
	빽단에 영향을 주는 것은 EL 표현식으 써야함  ${ }   -->
	<h1> JSTL 표현식</h1>
	<c:set var="name" value="micol"></c:set>
	<c:if test="${not empty name }">
		<h1>${name }</h1>
	</c:if>
</body>
</html>