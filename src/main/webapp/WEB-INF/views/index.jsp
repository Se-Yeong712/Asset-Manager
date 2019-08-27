<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("login")==null){%>
<button onclick="location.href='/login'">로그인</button>
<button onclick="location.href='/signup'">회원가입</button>
<%}%>
<% if(session.getAttribute("login")!=null){%>
	${sessionScope.login }님 환영합니다.
	<button onclick="location.href='/logout'">로그아웃</button>
<%}%>

<button onclick="location.href='/account'">계좌등록</button>

</body>
</html>