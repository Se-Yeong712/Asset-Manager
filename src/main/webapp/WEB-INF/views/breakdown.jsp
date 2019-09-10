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
<div class="form-inline form-group">
	<select name="type" class="form-control" style="width: 20%">
		<option value="1">입금내역</option>
		<option value="2">출금내역</option>
	</select>
	<input type="submit" class="btn btn-dark"value="확인">

</div>
</form>

<table>
<thead>
	<tr>
		<th>날짜</th>
		<th>계좌</th>
		<th>금액</th>
		<th>항목</th>
		<th>비고</th>
	</tr>	
</thead>
<c:forEach items="${list }" var="list">
	<tr>
	
	<td>${list.regdate }</td>
	<td>${list.account }</td>
	<td>${list.amount}</td>
	<td>${list.category }</td>
	<td>
	<c:if test="${type == 1 }">
	<a href="/dep?code=${list.code }"><button class="btn btn-light" style="border:1px solid;">선택</button></a>
	</c:if>
	<c:if test="${type == 2 }">
	<a href="/with?code=${list.code }"><button class="btn btn-light" style="border:1px solid;">선택</button></a>
	</c:if>
	</td>
	
	</tr>

</c:forEach>
</table>
</div>

</body>
</html>