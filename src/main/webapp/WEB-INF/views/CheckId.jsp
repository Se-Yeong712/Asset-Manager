<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function setId(){
	opener.document.getElementById("id").value=document.getElementById("id").value;
	self.close();
}
	

</script>

</head>
<body>

<h3>아이디 중복체크</h3>
<form action="/checkid"method="post">

<input type="text" name="id" id="id">
<% if(session.getAttribute("check")==null){%>
<input type="submit" value="중복확인" >
<%} %>

<div id="result"></div>

<% if(session.getAttribute("check")!=null){%>
<input type="button" value="닫기" onclick="setId()">
<%} %>

</form>


</body>
</html>