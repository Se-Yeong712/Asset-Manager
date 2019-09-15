<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.css">
</head>
<body>
<jsp:include page="menu.jsp" flush="false"></jsp:include>
	<div class="container bg-light"
		style="margin-left: 23%; margin-top: 2%; border-radius: 15px; width: 70%;">
		<p style="font-size: 30px; text-align: center;">Breakdown</p>

		<button class="btn btn-primary" onclick="location.href='/list'">내역</button>
		<button class="btn btn-primary" onclick="location.href='/calendar'">달력</button>
		<button class="btn btn-primary" onclick="location.href='/graph'">그래프</button>


		<c:if test="${selectlist==1 }">
			<hr>
			<form action="/list" method="post">

				<table>
					<tr style="text-align: center">
						<td>입출금선택</td>
						<td>계좌선택</td>
						<td>기간선택</td>

					</tr>
					<tr>
						<td><select name="type" class="form-control">
								<option value="1">입금내역</option>
								<option value="2">출금내역</option>
						</select></td>
						<td><select name="account" class="form-control">
								<option value="1">전체계좌</option>
								<option value="2">계좌별</option>
						</select></td>
						<td><select name="term" class="form-control">
								<option value="1">주간</option>
								<option value="2">월간</option>
								<option value="3">연간</option>
						</select></td>
						<td colspan="2"><input type="submit" class="btn btn-dark"
							value="확인"></td>
				</table>
			</form>
		</c:if>
		<!-- 계좌선택  -->
		<c:if test="${account==2 }">
			<hr>
			<form action="/accountlist" method="post">
				<div class="form-inline form-group">
					<input type="number" name="type" value=${type } hidden="true">
					<input type="number" name="term" value=${term } hidden="true">
					계좌별 &nbsp; <select name="accountlist" class="form-control"
						style="width: 40%">
						<option hidden="true">계좌선택</option>
						<c:forEach items="${accountlist }" var="account">
							<option value=${account.account }>${account.account }</option>
						</c:forEach>
					</select> &nbsp;&nbsp; <input type="submit" class="btn btn-dark" value="확인">
				</div>
			</form>
		</c:if>
		<br>
		<c:if test="${type == 1 || type== 2 }">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>날짜</th>
						<th>계좌</th>
						<th>금액</th>
						<th>항목</th>
						<th>비고</th>
					</tr>
				</thead>
				<c:forEach items="${list }" var="list">
					<tr>

						<td>${list.regdate }</td>
						<td>${list.account }</td>
						<td>${list.amount}</td>
						<td>${list.category }</td>
						<td><c:if test="${type == 1 }">
								<a href="/dep?code=${list.code }" class="text-primary">선택</a>
							</c:if> <c:if test="${type == 2 }">
								<a href="/with?code=${list.code }" class="text-primary">선택</a>
							</c:if></td>

					</tr>

				</c:forEach>
			</table>
		</c:if>

<c:if test="${calendar==1 }">
<form action="/calendar" method="post">
<hr>
<div class="form-inline form-group">
<input type="date" name="date" class="form-control">
<input type="submit" class="btn btn-dark" value="검색">
</div>

</form>
<hr>
<p class="text-primary" style="text-align:center; font-size:20px">선택하신 날의 금액내역은 다음과 같습니다.</p>
<div class="form-inline" style="margin-left:10%">
<div class="card" style="width:40%">
    <div class="card-body">
      <h4 class="card-title">입금내역</h4>
      <p class="card-text">총 ${caldep }원</p>
      <a href="/list" class="card-link">내역 보기</a>
      <a href="/graph" class="card-link">소비그래프 보기</a>
    </div>
</div>
<div style="width: 3%"></div>
<div class="card" style="width:40%">
    <div class="card-body">
      <h4 class="card-title">출금내역</h4>
      <p class="card-text">총 ${calwith }원</p>
      <a href="/list" class="card-link">내역 보기</a>
      <a href="/graph" class="card-link">소비그래프 보기</a>
    </div>
</div>
</div>




</c:if>
<c:if test="${graph==1}">
<hr>
			<canvas id="chartjs-0" class="chartjs" width="undefined"
				height="undefined"></canvas>
			<script>
				new Chart(document.getElementById("chartjs-0"), {
					"type" : "line",
					"data" : {
						"labels" : [ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" ],
						"datasets" : [ {
							"label" : "입금",
							"data" : [ "${depmon}", "${deptues}", "${depwednes}", "${depthurs}", "${depfri}", "${depsatur}", "${depsun}" ],
							"fill" : false,
							"borderColor" : "rgb(54, 162, 235)",
							"backgroundColor":"rgb(54, 162, 235)",
							"lineTension" : 0.1
						},
						{
							"label" : "출금",
							"data" : [ "${withmon}", "${withtues}", "${withwednes}", "${withthurs}", "${withfri}", "${withsatur}", "${withsun}" ],
							"fill" : false,
							"borderColor" : "rgb(255, 99, 132)",
							"backgroundColor":"rgb(255, 99, 132)",
							"lineTension" : 0.1
						}]
					},
					"options" : {}
				});
			</script>


	</c:if>












<br>
</div>

</body>
</html>