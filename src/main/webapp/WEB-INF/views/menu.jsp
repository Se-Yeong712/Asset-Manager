<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AssetManagement</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<style>
li a{
	font-size:20px;
	padding: 8px 8px;
}


</style>

</head>
<body class="bg-dark" style="  margin: 10px;">


<nav class="navbar navbar-dark bg-primary" 
style="width: 18%; height:100%; position: fixed; border-radius: 15px;">
  <ul class="navbar-nav">
<% if(session.getAttribute("login")==null){%>
    <li class="nav-item">
      <a class="nav-link" href="/login" >로그인</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/signup">회원가입</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/findinfo">정보찾기</a>
    </li>
<%}%>
<% if(session.getAttribute("login")!=null){%>
	${login }님 환영합니다.
	<hr> 
	<li class="nav-item">
      <a class="nav-link" href="/index">메인화면</a>
    </li>
	<li class="nav-item">
      <a class="nav-link" href="/logout">로그아웃</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/updatemember">정보수정</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/account">계좌등록</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/deposit">입금등록</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/withdraw">출금등록</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/breakdown">내역보기</a>
    </li>
    
<%}%>
  </ul>
  <div style="height: 100%; width: 100%;align-content: bottom;"></div>
</nav>

<div style="margin-left:23%; width:100%; height:2%; position: fixed;">
<p style="color:white;font-size:25px">Asset Manager</p>
</div>
<br>

</body>
</html>