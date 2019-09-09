<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

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

function CheckId(){
	
	var win = window.open("/checkid","CheckIdForm","width=500,height=300,resizable=no,scrollbars=no");

}


</script>

</head>
<body>
<jsp:include page="menu.jsp" flush="false"></jsp:include>
<div class="container bg-light" style="margin-left:23%; margin-top:2%; border-radius: 15px; width: 70%;">
<br><p style="font-size:30px; text-align:center;">Sign Up</p>

<form onsubmit="return blank();" action="/signup" method="post">
<div class="form-inline form-group">
<input type="text" class="form-control" name="id" id="id" readonly="readonly" placeholder="User ID" style="border-radius: 25px; width: 40%"> 
&nbsp;&nbsp; <input type="button" class="btn btn-light" style="border:1px solid; "value="ID중복확인" onclick="CheckId()">
&nbsp;&nbsp;<div id="result">아이디 중복확인을 해주세요.</div>
</div>
<div class="form-inline form-group">
<input type="password" class="form-control" placeholder="User Password" style="border-radius: 25px;" name="pw" id="pw"> <br>
&nbsp;&nbsp;<input type="password" class="form-control" placeholder="User Password Check" style="border-radius: 25px;" id="pwchk"> <br>
</div>
<input type="text" class="form-control" placeholder="User Name" style="border-radius: 25px; width:30%" name="name" id="name"> <br>
<div class="form-inline form-group">
<input type="text" class="form-control" placeholder="User Phone" style="border-radius: 25px; width:60%" name="phone" id="phone">
<font color="red">&nbsp;&nbsp;-는 빼고 입력해주세요</font> 
</div>
<input type="email" class="form-control" placeholder="User Email" style="border-radius: 25px; width:60%"name="email" id="email"> <br>

<input type="submit" class="btn btn-primary" value="회원가입">
<input type="reset" class="btn btn-primary" value="리셋">

</form>

<br><br>
</div>
</body>
</html>