<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.4.0.min.js"></script>
<script>
$(document).ready(function(){
	$("#find_id").click(function(){
		console.log("find_id");
		$("#formid").removeAttr("hidden");
		$("#formpw").attr("hidden","true");
	});
	$("#find_pw").click(function(){
		console.log("find_pw");
		$("#formid").attr("hidden","true");
		$("#formpw").removeAttr("hidden");
	});
	
});


</script>

</head>
<body>
<jsp:include page="menu.jsp" flush="false"></jsp:include>
<div class="container bg-light" style="margin-left:23%; margin-top:2%; border-radius: 15px; width: 70%;">
<br><p style="font-size:30px; text-align:center;">회원정보 찾기</p>

<div style="text-align:center">
<button class="btn btn-light" style="border-radius: 25px; border:1px solid" id="find_id">아이디찾기</button>
&nbsp;&nbsp;
<button class="btn btn-light" style="border-radius: 25px; border:1px solid" id="find_pw">비밀번호찾기</button>
</div>
<br>
<form action="/findid" method="post" id="formid" hidden="true">
<p class="text-primary" style="font-size:20px; text-align:center;">아이디 찾기</p>
<div class="form-inline form-group" style="text-align: center; align-content: center">
PW <input type="password" class="form-control" name="pw" placeholder="Password" style="border-radius: 25px; width: 45%">
&nbsp;&nbsp;이름 <input type="text"  class="form-control"  name="name" placeholder="User Name" style="border-radius: 25px; width: 45%">
</div>
<br>
<input class="btn btn-primary btn-block" style="border-radius: 25px;"type="submit" value="아이디찾기">
</form>

<form action="/findpw" method="post" id="formpw" hidden="true">
<p class="text-primary" style="font-size:20px; text-align:center;">비밀번호 찾기</p>
<div class="form-inline form-group" style="text-align: center;">
ID: <input type="text" class="form-control" name="id" placeholder="User ID" style="border-radius: 25px; width: 45%">
&nbsp;&nbsp;이름: <input type="text"  class="form-control"  name="name" placeholder="User Name" style="border-radius: 25px; width: 45%">
</div>
<br>
<input class="btn btn-primary btn-block" style="border-radius: 25px;"type="submit" value="비밀번호찾기">
</form>
<br><br>


</div>
</body>
</html>