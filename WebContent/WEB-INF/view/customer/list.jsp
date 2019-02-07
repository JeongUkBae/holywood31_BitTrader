<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" 
	href="${css}/customer/list.css" />
<link rel="stylesheet" href="${css}/customer/navi_bar.css" />
<div class="grid-item" id="navi_bar">
	<jsp:include page="../home/post-navi-bar.jsp"/>
	</div>
<div class="grid-item" id="side_menu">
 	<h1><font style="font-size: 30px">리스트</font></h1>
</div>

<div class="grid-item" id="content">


<table id="cust_tab">
  <tr>
    <th>No.</th>
    <th>고객번호</th>
    <th>이    름</th>
    <th>닉 네 임</th>
    <th>도    시</th>
    <th>상세주소</th>
    <th>우편번호</th>
    <th>국    가</th>
  </tr>
  <tr>
    <td>1</td>
    <td>1234</td>
    <td>홍길동</td>
    <td>hong</td>
    <td>서울시 강남구</td>
    <td>강남대로 1</td>
    <td>12345</td>
    <td>대한민국</td>
  </tr>
  <tr>
    <td>1</td>
    <td>1234</td>
    <td>홍길동</td>
    <td>hong</td>
    <td>서울시 강남구</td>
    <td>강남대로 1</td>
    <td>12345</td>
    <td>대한민국</td>

  </tr>
  <tr>
    <td>1</td>
    <td>1234</td>
    <td>홍길동</td>
    <td>hong</td>
    <td>서울시 강남구</td>
    <td>강남대로 1</td>
    <td>12345</td>
    <td>대한민국</td>
  </tr>
  <tr>
    <td>1</td>
    <td>1234</td>
    <td>홍길동</td>
    <td>hong</td>
    <td>서울시 강남구</td>
    <td>강남대로 1</td>
    <td>12345</td>
    <td>대한민국</td>
  </tr>
  <tr>
    <td>1</td>
    <td>1234</td>
    <td>홍길동</td>
    <td>hong</td>
    <td>서울시 강남구</td>
    <td>강남대로 1</td>
    <td>12345</td>
    <td>대한민국</td>
  </tr>
  <tr>
    <td>1</td>
    <td>1234</td>
    <td>홍길동</td>
    <td>hong</td>
    <td>서울시 강남구</td>
    <td>강남대로 1</td>
    <td>12345</td>
    <td>대한민국</td>
  </tr>
</table>

<div class="center">
  <div class="pagination">
  <a href="#">&laquo;</a>
  <a href="#" class="active">1</a>
  <a href="#">2</a>
  <a href="#">3</a>
  <a href="#">4</a>
  <a href="#">5</a>
  <a href="#">&raquo;</a>
  </div>
</div>
</div>
<jsp:include page="../home/bottom.jsp"/>
<script>

</script>