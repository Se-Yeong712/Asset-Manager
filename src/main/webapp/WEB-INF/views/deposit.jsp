<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
deposit
날짜 : 

<form action ="/deposit" method="post">
계좌 : 
<select name="depaccount">
<c:forEach items="${account }" var="account">
<option value=${account.account }>${account.account }</option>
</c:forEach>
</select>

금액 : <input type="text" name="depamount">
입금항목 : <input type="text" name="depcate">





</form>


</body>
</html>