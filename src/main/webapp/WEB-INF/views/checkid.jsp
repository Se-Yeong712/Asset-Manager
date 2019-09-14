<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script type="text/javascript">



function setId(){
	opener.document.getElementById("id").value=document.getElementById("id").value;
	opener.document.getElementById("result").innerHTML="사용할 수 있는 아이디입니다.";
	self.close();
}
	

</script>

</head>
<body class="bg-light" style="margin:10%">

<p style="font-size:20px">아이디 중복체크</p>
<form action="/checkid"method="post">

<% if(session.getAttribute("check")==null || session.getAttribute("check")=="0"){%>
<div class="form-inline form-group">
<input type="text" class="form-control" style="width:60%" 	name="id" id="id" value="${id }">
&nbsp;&nbsp;
<input type="submit" class="btn btn-primary" value="중복확인" >
</div>
<%} %>

<% if(session.getAttribute("check")=="0"){%>
<div>같은 아이디가 존재합니다.</div>
<%} %>



<% if(session.getAttribute("check")=="1"){%>
<div class="form-inline form-group">
<input type="text" class="form-control" style="width:60%" name="id" id="id" value="${id }" readonly="readonly">
&nbsp;&nbsp;
<input type="button" value="닫기" class="btn btn-primary" onclick="setId()">
</div>
<div>사용할 수 있는 아이디입니다.</div>
<%
session.removeAttribute("check");
session.removeAttribute("id");
} %>

</form>


</body>
</html>