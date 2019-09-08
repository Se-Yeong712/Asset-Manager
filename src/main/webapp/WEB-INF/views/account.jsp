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
<div class="container" style="margin-left:25%">
<form action="/account" method="post">
계좌번호 : <input type="text" name="account">
은행 : 
<select name="bank">
<c:forEach items="${bank }" var="bank">
<option value=${bank.bank }>${bank.bank }</option>
</c:forEach>
</select>


계좌이름 : <input type="text" name="aname">
아이디 : <input type="text" name="id" value="${login }"readonly="readonly">

<input type="submit" value="계좌등록">
</form>
</div>
</body>
</html>