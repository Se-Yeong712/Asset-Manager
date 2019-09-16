<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AssetManagement</title>
</head>
<body>

<jsp:include page="menu.jsp" flush="false"></jsp:include>
<div class="container bg-light" style="margin-left:23%; margin-top:2%; border-radius: 15px; width: 70%;">
<c:if test="${login==null }">

<br>
<br>
<div class="card">
<img class="card-img-top" src="https://t1.daumcdn.net/cfile/tistory/2131954D58A6901D3A" alt="Card image" style="width:70%;">
    <div class="card-body">
      <h4 class="card-title">자산관리시작하기</h4>
      <p class="card-text">지금 바로 자산관리 시작하세요!</p>
      <a href="/login" class="card-link">로그인</a>
      <a href="/signup" class="card-link">회원가입</a>
    </div>
</div>
<br>
</c:if>
<c:if test="${login != null }">
<br>
<p class="text-primary" style="font-size:30px; text-align:center;">${login }님의 소비리포트</p>

<div class="form-inline" style="margin-left:10%">
<div class="card" style="width:40%">
    <div class="card-body">
      <h4 class="card-title">항목별 출금내역</h4>
      <p class="card-text">
      <table class="table table-hover">
				<thead>
					<tr>
						<th>항목</th>
						<th>금액</th>
					</tr>
				</thead>
				<c:forEach items="${category }" var="category">
					<tr>
						<td>${category.category }</td>
						<td>${category.amount }</td>
					</tr>
				</c:forEach>
		</table>
    </div>
</div>
<div style="width: 3%"></div>
<div class="card" style="width:40%">
    <div class="card-body">
      <h4 class="card-title">충동지출 확인</h4>
      <hr>
      <p class="card-text">1만원이상 출금내역 ${impulse.one }건</p>
      <p class="card-text">10만원이상 출금내역 ${impulse.two }건</p>
      <p class="card-text">30만원이상 출금내역 ${impulse.three }건</p>
      <p class="card-text">50만원이상 출금내역 ${impulse.four }건</p>
      <a href="/list"><button class="btn btn-primary">내역 보기</button></a>
    </div>
</div>
</div>




</c:if>

<br>
<br>
</div>

</body>
</html>