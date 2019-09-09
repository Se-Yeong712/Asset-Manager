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
<p style="font-size:30px; text-align:center;">Breakdown</p>

<form action="/breakdown" method="post">
	<select name="type">
		<option value="1">입금내역</option>
		<option value="2">출금내역</option>
	</select>
	<input type="submit" value="확인">
</form>

<table>
<thead>
	<tr>
		<th>날짜</th>
		<th>계좌</th>
		<th>금액</th>
		<th>항목</th>
	</tr>	
</thead>
<c:forEach items="${list }" var="list">
	<tr>
	<td>${list.regdate }</td>
	<td>${list.account }</td>
	<td>${list.amount}</td>
	<td>${list.category }</td>
	</tr>

</c:forEach>
</table>
</div>

</body>
</html>