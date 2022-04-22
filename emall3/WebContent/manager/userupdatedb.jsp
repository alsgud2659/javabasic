<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String uid = request.getParameter("uid");
String upw = request.getParameter("upw");
String uname = request.getParameter("uname");
String ugender = request.getParameter("ugender");
String uemail = request.getParameter("uemail");
String uphone = request.getParameter("uphone");
String uaddr = request.getParameter("uaddr");
String ubirth = request.getParameter("ubirth");

UserDAO dao = new UserDAO();
int result = dao.update(uid, upw, uname, ugender, ubirth, uemail, uphone, uaddr);

if(result == 1){
	response.sendRedirect("manageuser.jsp");
}else{
	out.print("수정 실패");
}
%>
</body>
</html>