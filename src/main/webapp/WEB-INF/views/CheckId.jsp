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
	opener.document.getElementById("result").innerHTML="사용할 수 있는 아이디입니다.";
	self.close();
}
	

</script>

</head>
<body>

<h3>아이디 중복체크</h3>
<form action="/checkid"method="post">

<% if(session.getAttribute("check")==null || session.getAttribute("check")=="0"){%>
<input type="text" name="id" id="id" value="${id }">
<input type="submit" value="중복확인" >
<%} %>

<% if(session.getAttribute("check")=="0"){%>
<div>같은 아이디가 존재합니다.</div>
<%} %>



<% if(session.getAttribute("check")=="1"){%>
<input type="text" name="id" id="id" value="${id }" readonly="readonly">
<input type="button" value="닫기" onclick="setId()">
<div>사용할 수 있는 아이디입니다.</div>
<%
session.removeAttribute("check");
session.removeAttribute("id");
} %>

</form>


</body>
</html>