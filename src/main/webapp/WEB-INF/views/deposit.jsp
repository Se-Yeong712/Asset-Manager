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
<br><p style="font-size:30px; text-align:center;">Deposit Register</p>

<form action ="/deposit" method="post">

<select name="account" class="form-control">
<option hidden="true">계좌선택</option>
<c:forEach items="${account }" var="account">
<option value=${account.account }>${account.account }</option>
</c:forEach>
</select>
<br>

<input type="date" name="regdate" class="form-control" >
<br>

<input type="text" name="amount" class="form-control" placeholder="입금금액">
<br>

<input type="text" name="category" class="form-control" placeholder="입금항목">
<br>

<input type="text" name="id" value="${login }"  class="form-control"readonly="readonly">
<br>
<input type="submit" value="등록" class="btn btn-primary">
<br>
</form>
<br>
</div>

</body>
</html>