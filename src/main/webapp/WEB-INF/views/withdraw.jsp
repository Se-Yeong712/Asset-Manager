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
withdraw
<form action ="/withdraw" method="post">
날짜:<input type="date" name="withdate">
계좌 : 
<select name="withaccount">
<c:forEach items="${account }" var="account">
<option value=${account.account }>${account.account }</option>
</c:forEach>
</select>

출금금액 : <input type="text" name="withamount">
출금항목 : <input type="text" name="withcate">
회원 : <input type="text" name="id" value="${login }" readonly="readonly">

<input type="submit" value="등록">

</form>


</body>
</html>