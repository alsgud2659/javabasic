<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 속성 설정</title>
</head>
<body>
<b>세션 속성 설정</b> <br>
<%
session.setAttribute("id", "admin");
session.setAttribute("name", "관리자");
out.print("세션 속성 설정 완료! <br>");
%>

세션 아이디 : <%=session.getAttribute("id") %> <br>
세션 네임 : <%=session.getAttribute("name") %><br>

<p><a href="session_check.jsp">[세션 확인]</a></p>
<p><a href="session_delete.jsp">[세션 삭제]</a></p>
</body>
</html>