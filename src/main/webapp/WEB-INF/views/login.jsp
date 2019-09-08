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
<p style="font-size:30px; text-align:center;">Login</p>
<form action ="/login" method="post">

<input class="form-control"type="text" name="id" placeholder="Enter User ID" style="border-radius: 25px;">
<br>
<input class="form-control"type="password" name="pw" placeholder="Password" style="border-radius: 25px;">

<br>
<input class="btn btn-primary btn-block"type="submit" style="border-radius: 25px;"value="로그인">

</form>
<hr>
<a class="nav-link" href="/signup" style="font-size:15px;text-align:center">Forgot Password? &nbsp;&nbsp;
<button class="btn btn-light" style="border-radius: 25px; border:1px solid" onclick="location.href='/signup'">비밀번호 찾기</button>
</a>	
<br>
<a class="nav-link" href="/signup" style="font-size:15px;text-align:center">Create an Account &nbsp;&nbsp;&nbsp;&nbsp;
<button class="btn btn-light" style="border-radius: 25px; border:1px solid;" onclick="location.href='/signup'">회원가입</button>
</a>

<br>
</div>
</body>
</html>