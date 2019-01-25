<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<jsp:include page="head.jsp"/>
<body>
	<%
		System.out.println(" => 홈 메인 입장");
	%>
	<table id="wrapper">
		<tr>
			<td colspan="2">
				
			<%@ include file="header.jsp"%>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<c:choose>
					<c:when test="${compo eq 'pre'}"> 
						<jsp:include page="pre-navi-bar.jsp"/>
					</c:when>
					<c:otherwise>
						<jsp:include page="post-navi-bar.jsp"/>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr style="height: 300px">
			<td style="width: 30%"><%@ include file="side-menu.jsp"%>
			</td>
			<td>
				<div id="content">
					컨텐츠 
					<c:choose>
						<c:when test="${compo eq 'pre'}"> 
							<jsp:include page="../employee/register.jsp"/>
						</c:when>
						<c:otherwise>
							<jsp:include page="../employee/register.jsp"/>
						</c:otherwise>
					</c:choose>
			<!-- swich -->
<!-- 			<c:choose>
				<c:when test="${dest eq 'welcome'}">
					<jsp:include page="welcome.jsp"/>
				</c:when>
			</c:choose>
 -->			
				</div>
			</td>
		</tr>
		<tr style="height: 100px;">
			<td colspan="2"><%@ include file="footer.jsp"%>


			</td>
		</tr>
	</table>
</body>
</html>