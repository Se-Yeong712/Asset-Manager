<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/account" method="post">
계좌번호 : <input type="text" name="account">
은행 : <input type="text" name="bank">
계좌이름 : <input type="text" name="aname">
아이디 : <input type="text" name="id" value="${sessionScope.login }"readonly="readonly">

<input type="submit" value="계좌등록">
</form>

</body>
</html>