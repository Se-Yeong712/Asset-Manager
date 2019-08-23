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
		alert("모두 입력해주세요");
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
	window.name="CheckIdForm"
	window.open("CheckId.jsp","CheckIdForm","width=500,height=300,resizable=no,scrollbars=no")
}


</script>

</head>
<body>
<h2>회원가입</h2>
<form onsubmit="return blank();" action="/signup" method="post">
ID : <input type="text" name="id" id="id"> 
<input type="button" value="ID중복확인" onclick="CheckId()">
<br>
PW : <input type="password" name="pw" id="pw"> <br>
pw확인 : <input type="password" id="pwchk"> <br>
이름 : <input type="text" name="name" id="name"> <br>
전화번호 : <input type="text" name="phone" id="phone"> <br>
<font color="red">-는 빼고 입력해주세요</font> <br>
이메일 : <input type="email" name="email" id="email"> <br>


<input type="submit" value="회원가입">
<input type="reset" value="리셋">
</form>




</body>
</html>