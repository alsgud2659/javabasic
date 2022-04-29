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
if (!dao.exists(userid)) { // DB에 아이디 자체가 존재하지 않으므로 회원가입으로 리다이렉트
	out.print("<script> alert('아이디가 존재하지않습니다.');");
	%>
	history.back();
	<%
	out.print("</script>");
} else {
	dao.delete(userid);
	session.removeAttribute("userid");
	response.sendRedirect("userjoin.jsp");
}
%>