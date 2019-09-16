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
<br><p style="font-size:30px; text-align:center;">Breakdown Content</p>
<c:if test="${type == 1 }">
<form action ="/updatedep" method="post">

<select name="account" class="form-control">
<option hidden="true">${content.account }</option>
<c:forEach items="${account }" var="account">
<option value=${account.account }>${account.account }</option>
</c:forEach>
</select>
<br>

<div class="form-inline from-group">
<input type="text" class="form-control" value="${content.bank }" style="width:50%">
<input type="text" class="form-control" value="${content.aname }"style="width:50%">
</div>
<br>

<input type="date" name="regdate" class="form-control" value="${content.regdate }" >
<br>

<input type="text" name="amount" class="form-control" value="${content.amount }">
<br>

<input type="text" name="category" class="form-control" value="${content.category }" >
<br>

<input type="text" name="id" value="${login }"  class="form-control" readonly="readonly">
<br>

<input type="hidden" name="code"  value="${content.code }" >

<input type="button" value="목록" class="btn btn-primary" onclick="history.go(-1)">
<input type="submit" value="수정" class="btn btn-info">
<input type="button" value="삭제" class="btn btn-danger" onclick="location.href='/deletedep?code=${content.code}'">
</form>
</c:if>


<c:if test="${type == 2 }">
<form action ="/updatewith" method="post">

<select name="account" class="form-control">
<option hidden="true">${content.account }</option>
<c:forEach items="${account }" var="account">
<option value=${account.account }>${account.account }</option>
</c:forEach>
</select>
<br>

<div class="form-inline from-group">
<input type="text" class="form-control" value="${content.bank }" style="width:50%">
<input type="text" class="form-control" value="${content.aname }"style="width:50%">
</div>
<br>

<input type="date" name="regdate" class="form-control" value="${content.regdate }" >
<br>

<input type="text" name="amount" class="form-control" value="${content.amount }">
<br>

<input type="text" name="category" class="form-control" value="${content.category }" >
<br>

<input type="text" name="id" value="${login }"  class="form-control" readonly="readonly">
<br>
<input type="hidden" name="code"  value="${content.code }" >

<input type="button" value="목록" class="btn btn-primary" onclick="history.go(-1)">
<input type="submit" value="수정" class="btn btn-info">
<input type="button" value="삭제" class="btn btn-danger" onclick="location.href='/deletewith?code=${content.code}'">
</form>
</c:if>

<br>
</div>
</body>
</html>