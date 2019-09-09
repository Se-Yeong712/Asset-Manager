<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp" flush="false"></jsp:include>
<div class="container bg-light" style="margin-left:23%; margin-top:2%; border-radius: 15px; width: 70%;">
<p style="font-size:30px; text-align:center;">회원정보 찾기</p>
<br>
<div style="font-size:20px">
회원님께서 조회하신 정보는 <font class="text-primary"> ${sessionScope.result }</font>입니다.
</div>
<br>


</div>

</body>
</html>