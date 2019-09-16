<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp" flush="false"></jsp:include>
<div class="container bg-light" style="margin-left:23%; margin-top:2%; border-radius: 15px; width: 70%;">
<br>
<p class="text-primary" style="font-size:30px; text-align:center;">DEVELOPER PAGE</p>
<hr>

<div style="margin-left:20%;">

<div style='font-size:20px;'>���߿� ���� ���̺� ������ �ñ��ϽŰ��� &#10067;
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal1">���̺� ����</button>
	<div class="modal fade" id="myModal1">
    <div class="modal-dialog modal-dialog-centered modal-lg">
      <div class="modal-content">
      
        <div class="modal-header">
          <h4 class="modal-title">���̺� ����</h4>
          <button type="button" class="close" data-dismiss="modal">��</button>
        </div>
        
        <div class="modal-body">
          <table class="table table-hover">
				<thead>
					<tr>
						<th>OWNER</th>
						<th>TABLE_NAME</th>
						<th>TABLE_TYPE</th>
						<th>COMMENTS</th>
					</tr>
				</thead>
				<c:forEach items="${table }" var="table">
					<tr>
						<td>${table.owner }</td>
						<td>${table.table_name }</td>
						<td>${table.table_type }</td>
						<td>${table.comments }</td>
					</tr>
				</c:forEach>
		</table>
        </div>
        
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">�ݱ�</button>
        </div>
        
      </div>
    </div>
  </div>


</div>
<br>
<div style='font-size:20px;'>�����ڿ� ���� �ñ��ϽŰ��� &#10067;
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal2">������ ����</button>
	<div class="modal fade" id="myModal2">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
      
        <div class="modal-header">
          <h4 class="modal-title">������ ����</h4>
          <button type="button" class="close" data-dismiss="modal">��</button>
        </div>
        
        <div class="modal-body">
          	������ �̼���<br>
          	�̸������������а���б� ����<br>
          	<hr>
          	
          	<a href="mailto:s2017s14@e-mirim.hs.kr" target="_blank">
          	<img alt="email" src="http://icons.iconarchive.com/icons/graphicloads/100-flat/256/email-2-icon.png" style="width: 50px; height: 50px">
        	</a>
        	
          	<a href="https://github.com/Se-Yeong712" target="_blank">
          	<img alt="github" src="https://cdn.tutsplus.com/net/uploads/2013/08/github-collab-retina-preview.gif" style="width: 50px; height: 50px">
        	</a>
        
        	<a href="https://www.facebook.com/lsysy123" target="_blank">
          	<img alt="facebook" src="https://facebookbrand.com/wp-content/themes/fb-branding/assets/images/fb-logo.png?v2" style="width: 50px; height: 50px">
        	</a>
        
        
        </div>
        
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">�ݱ�</button>
        </div>
        
      </div>
    </div>
  </div>

</div>

</div>
<br>
<br>
</div>
</body>
</html>