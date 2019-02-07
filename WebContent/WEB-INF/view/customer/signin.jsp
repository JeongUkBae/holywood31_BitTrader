<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" 
	href="${css}/employee/register.css" />
<div class="grid-item" id="side_menu">
	<h1><font style="font-size: 30px">회원 접속</font></h1>
</div>
<div>
<section>
<article>
	<h1 id="title">회원 전용 시스템</h1>
<form id="form">
  <h1>회원 로그인</h1>
  <div class="rbox">
  <b>ID <input type="text" class="inputbox" name="customerid" id="customerid" value="lee1"></b>
  </div>

  <div class="rbox">
  <b>비밀번호 <input type="text" name="cpassword" id="cpassword" value="1111"/></b>
  </div>

  <div class="selbox">
    <input type="submit" id="confirm_btn" value="접속"/>
   </div>
   <div class="selbox">
    <input type="submit" id="cancel_btn" value="취소"/>
  </div>
    <input type="hidden" name="cmd" value="signin" />
    <input type="hidden" name="dir" value="category" />
    <input type="hidden" name="page" value="main" />
</form>
</article>
</section>

</div>
<jsp:include page="../home/bottom.jsp"/>
<script>
$('#confirm_btn').click(function(){
	var customerid = $('#customerid').val();
	var cpassword = $('#cpassword').val();
	$('#form').attr('action','${ctx}/category.do')
	.submit();
});

/*location.assign('member.do?dest=join-form'); */
/* 	window.onload = function(){
		location.assign('member.do?dest=join-form');
	} */
/*	document.getElementById('join-link')
	.addEventListener('click', function() { //어나니머스 함수 (이름지움.)
		alert('회원가입 클릭');
		location.assign('member.do?dest=join-form');
	}); */
	// move 이면 클릭이벤트가 리스닝되고,
	// move() 가 있으면 즉시 실행됨.
	// 'click', function(){} 하면 콜백함수가 호출된다. 

</script>

