<%@page import="jdbc.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

String userid = request.getParameter("id");
String userpw = request.getParameter("pw");


UserDAO dao = new UserDAO();

// 로그인 결과 3가지 리턴
int result = dao.login(userid, userpw);
if (result == 1) { // DB에 아이디 자체가 존재하지 않으므로 회원가입으로 리다이렉트
	out.print("<script> alert('아이디가 존재하지않습니다.');");
	%>
	
	<%
	out.print("</script>");
	response.sendRedirect("userjoin.jsp");
} else if (result == 2){ // 아이디는 있으나 비밀번호가 불일치
	out.print("<script> alert('아이디가 존재하지않습니다.');");
	%>
	history.back();
	<%
	out.print("</script>");
} else {
	session.setAttribute("userid", userid);
	response.sendRedirect("main.jsp");
}
%>