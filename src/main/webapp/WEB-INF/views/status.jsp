<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	var message = "${msg}";
	var url = "${url}";
	
	alert(message); 
	document.location.href = url; 

	
</script>
</head>
<body>

</body>
</html>