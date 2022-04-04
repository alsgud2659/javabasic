<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>쿠키 변경</b>
<%
	Cookie cookie = new Cookie("id","24LeeMinHyung123"); // 쿠키 객체 생성
	cookie.setMaxAge(300); // 초단위, 5분간 유지, 쿠키 생존 시간 설정
	response.addCookie(cookie);
	
	out.print("쿠키 변경 완료 <br>");
%>

쿠키      이름 : <%=cookie.getName() %> <br>
쿠키         값 : <%=cookie.getValue() %> <br>
쿠키 유효시간 : <%=cookie.getMaxAge() %>초 <br>

<p><a href="cookie_check.jsp">[쿠키확인]</a></p>
</body>
</html>