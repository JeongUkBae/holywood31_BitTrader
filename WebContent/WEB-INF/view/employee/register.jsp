<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../home/top.jsp"/>

<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">사원 등록</font></h1>
</div>
 <div>
 <form id="register_form">
  <h1>사원등록</h1>
  <div class="rbox">
  <b>사원번호 <input type="text" class="inputbox" name="empno" id="empno"></b>
  </div>

  <div class="rbox">
  <b>이 름 <input type="text" name="ename" id="ename"/></b>
  </div>

  <div class="rbox">
   <b>매니저 <input type="text" name="emag" id="emag"/></b>
  </div>

  <div class="rbox">
  <b>생년월일 <input type="text" name="ebd" id="ebd"/></b>
  </div>

  <div class="rbox">
    <b>상 세 <input type="text" name="notes" /> </b>   
  </div>

  <div class="selbox">
    <input type="submit" id="confirm_btn" value="등록"/>
   </div>
   <div class="selbox">
    <input type="submit" id="cancel_btn" value="취소"/>
  </div>
	<input type="hidden" name="cmd" value="move" />
	<input type="hidden" name="page" value="access" />
</form>
</div>
<jsp:include page="../home/bottom.jsp"/>
    <script>
 		 $('#confirm_btn').click(function(){
	  		var empno = $('#empno').val();
	  		var ename = $('#ename').val();
	  		var e_num = $('#e_num').val();
	  		var emag = $('#emag').val();
	  		var ebd = $('#ebd').val();
	  		$('#register_form').attr('action','${ctx}/employee.do').submit;
 		
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