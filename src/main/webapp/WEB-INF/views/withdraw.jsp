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
<jsp:include page="menu.jsp" flush="false"></jsp:include>
<div class="container bg-light" style="margin-left:23%; margin-top:2%; border-radius: 15px; width: 70%;">
<p style="font-size:30px; text-align:center;">withdraw</p>

<form action ="/withdraw" method="post">
날짜:<input type="date" name="regdate">
계좌 : 
<select name="account">
<c:forEach items="${account }" var="account">
<option value=${account.account }>${account.account }</option>
</c:forEach>
</select>

출금금액 : <input type="text" name="amount">
출금항목 : <input type="text" name="category">
회원 : <input type="text" name="id" value="${login }" readonly="readonly">

<input type="submit" value="등록">

</form>

</div>
</body>
</html>