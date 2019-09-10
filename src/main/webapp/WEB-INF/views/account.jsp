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
<div class="container bg-light" style="margin-left:30%; margin-top:2%; border-radius: 15px; width: 60%;">
<br><p style="font-size:30px; text-align:center;">Account Register</p>

<form action="/account" method="post" style="margin-left: 10%">
<input type="text" name="account" class="form-control" style=" width:90%"placeholder="Account Number"><br>

<div class="form-inline form-group">
<select name="bank" class="form-control" style=" width:40%">
<option hidden="true">은행선택</option>
<c:forEach items="${bank }" var="bank">
<option value=${bank.bank }>${bank.bank }</option>
</c:forEach>
</select>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="aname" class="form-control" style=" width:43%"  placeholder="Account Name"><br>
</div>
<input type="text" name="id" value="${login }"readonly="readonly" style="width:90%" class="form-control" placeholder="User ID">
<br>
<input type="submit" class="btn btn-primary" value="계좌등록">
</form>
<br>
</div>
</body>
</html>