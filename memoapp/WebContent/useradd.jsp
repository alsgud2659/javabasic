<%@page import="jdbc.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

String userid = request.getParameter("id");
String userpw = request.getParameter("pw");
String username = request.getParameter("name");

UserDAO dao = new UserDAO();
if (dao.exists(userid)) {
	out.print("<script> alert('이미 존재하는 아이디입니다. 다시 설정하세요.');");
%>
history.back();
<%
	out.print("</script>");
} else {
dao.insert(userid, userpw, username);
session.setAttribute("userid", userid);
response.sendRedirect("main.jsp");
}
%>