<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" 
	href="${css}/employee/register.css" />
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">회원 등록</font></h1>
</div>
 <div>
 <form id="signup_form">
  <h1>회원정보</h1>
  <div class="rbox">
   <b>아이디 <input type="text" name="customId" id="customId"/></b>
  </div>

  <div class="rbox">
  <b>이 름 <input type="text" name="cname" id="cname"/></b>
  </div>

  <div class="rbox">
  <b>패스워드 <input type="text" name="cpassword" id="cpassword"/></b>
  </div>
    <div class="rbox">
  <b>주소 <input type="text" name="addr" id="addr"/></b>
  </div>

  <div class="rbox">
    <b>도시 <input type="text" name="city" id="city"/> </b>   
  </div>
   <div class="rbox">
    <b>우편번호 <input type="text" name="pcode" id="pcode"/> </b>   
  </div>
    <div class="rbox">
    <b>주민번호 <input type="text" name="ssn" id="ssn"/> </b>   
  </div>

  <div class="selbox">
    <input type="submit" id="confirm_btn"  value="등록"/>
   </div>
   <div class="selbox">
    <input type="submit" id="cancel_btn" value="취소"/>
  </div>
	<input type="hidden" name="cmd" value="signup" />
	<input type="hidden" name="page" value="signin" />
</form>
</div>
<jsp:include page="../home/bottom.jsp"/>
    <script>
 		 $('#confirm_btn').click(function(){
 			var customId = $('#customId').val();
 			var cname = $('#cname').val();
 			var cpassword = $('#cpassword').val();
	  		var addr = $('#addr').val();
	  		var city = $('#city').val();
	  		var pcode = $('#pcode').val();
	  		var ssn = $('#ssn').val();
	  		$('#signup_form').attr('action','${ctx}/customer.do').submit;
 		
		});
	  		
// 	  		if(empno === ''||ename === ''||
//	  				emag === ''||ebd === ''){
//	  			alert('필수 입력값이 없습니다.');	
//	  		} else  {
//	  			alert('else 로 넘어왔다~.');
//	  			$('#register_form').attr('action','${ctx}/employee.do').submit;
//	  		}
// 			});

//  		$('#cancel_btn').click(function(){
//  			alert('취소버튼 클릭'); 
 // 			});   */
  </script>


 <!-- employeeID, manager,name, birthDate, photo, notes-->