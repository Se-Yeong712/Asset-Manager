<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

function blank(){
	var id=document.getElementById("id").value;
	var pw=document.getElementById("pw").value;
	var pwchk=document.getElementById("pwchk").value;
	var name=document.getElementById("name").value;
	var phone=document.getElementById("phone").value;
	var email=document.getElementById("email").value;
	
	
	if(id=="" || pw=="" || pwchk=="" || name=="" || phone=="" ||email==""){
		alert("빈칸없이 입력해주세요");
		return false;
	}
	
	if(pw != pwchk){
		alert("비밀번호가 틀렸습니다.");
		pw="";
		pwchk="";
		return false;
	}	
	
	return true;
	
}

</script>

</head>
<body>
<jsp:include page="menu.jsp" flush="false"></jsp:include>
<div class="container bg-light" style="margin-left:23%; margin-top:2%; border-radius: 15px; width: 70%;">
<br><p style="font-size:30px; text-align:center;">회원정보 수정</p>

<form onsubmit="return blank();" action="/updatemember" method="post">
<div class="form-group">
<input type="text" class="form-control" name="id" id="id" value="${member.id}"readonly="readonly" style="border-radius: 25px; width: 40%"> 
</div>

<div class="form-inline form-group">
<input type="password" class="form-control" value="${member.pw}" style="border-radius: 25px;" name="pw" id="pw"> <br>
&nbsp;&nbsp;<input type="password" class="form-control" value="${member.pw}" style="border-radius: 25px;" id="pwchk"> <br>
</div>

<input type="text" class="form-control" value="${member.name}"style="border-radius: 25px; width:60%" name="name" id="name"> <br>
<div class="form-inline form-group">
<input type="text" class="form-control" value="${member.phone}"style="border-radius: 25px; width:60%" name="phone" id="phone">
<font color="red">&nbsp;&nbsp;-는 빼고 입력해주세요</font> 
</div>
<input type="email" class="form-control" value="${member.email}" style="border-radius: 25px; width:60%"name="email" id="email"> <br>

<input type="submit" class="btn btn-primary" value="수정">
<input type="button" class="btn btn-primary" value="취소" onclick="location.href='/index'">

</form>

<br><br>
</div>
</body>
</html>