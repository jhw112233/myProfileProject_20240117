<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/title.css">
<link rel="stylesheet" href="/resources/css/content.css"> 
<script type="text/javascript" src="/resources/js/join.js"></script>
<title>## My Profile ##</title>
</head>
<body>
	<c:if test="${joinFail == 1}">
		<script type="text/javascript">
			alert('이미 가입된 아이디입니다. 다시 입력해주세요.');
			history.go(-1);
		</script>
	</c:if>

	<%@ include file="include/header.jsp" %>
	<center>
	<table border="0" cellpadding="20" cellspacing="0">
		<tr>
			<td align="center">
				<span class="title01">DEVELOPER JUNGHEE's PROFILE</span>
			</td>
		</tr>
		<tr>
			<td align="center">
				<span class="title02">I'm junghee, a developer who wants a development</span>
			
			</td>
		</tr>
		<tr>
			<td class="con_box" align="center">
				<table border="0" cellpadding="10" cellspacing="0" >
					<form action="joinOk" method="post" name="joinForm">
					<tr align="center">
						<td class="con_text02" >
						${memberName}님 회원가입을 축하드립니다!!<br>
						가입하신 아이디는 ${memberId}입니다.<br><br>
						로그인시 질문게시판에서 글작성이 가능합니다.   
						</td>
						
					</tr>
					
					<tr>
						<td >&nbsp;&nbsp;</td>
					</tr>
					<tr>
						<td align="center">

							<input class="con_btn01" type="button" value="로그인" onclick="javascript:window.location.href='login'">
						</td>
					</tr>
				</form>
				</table>
			</td>
		</tr>
		
	
	</table>
	</center>
	<%@ include file="include/footer.jsp" %>
</body>
</html>