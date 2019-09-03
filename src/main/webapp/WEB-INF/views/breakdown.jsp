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

<h3>내역</h3>

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
	<td>${list.depdate }</td>
	<td>${list.depaccount }</td>
	<td>${list.depamount}</td>
	<td>${list.depcate }</td>
	</tr>

</c:forEach>
</table>


</body>
</html>