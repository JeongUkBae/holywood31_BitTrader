<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="${css}main.css" />

<jsp:include page="top.jsp"/>

  <div class="grid-main-content">
    <div class="grid-item" id="item1">일반 회원<br><br>
       <a href="#">로그인</a><br>
        <a href="#">회원가입</a>
    </div>
    <div class="grid-item" id="item2">직원 회원<br><br>
      <a href="#" name="access" id="access">로그인</a><br>
      <a href="#" name="register" id="register">회원가입</a>
    </div>
  </div>
</div>
<jsp:include page="bottom.jsp"/>
<script>
		$('#register').click(function(){
			alert('회원가입 클릭 !!!');
			location.assign('employee.do?cmd=move&page=register');
		});
		
</script>