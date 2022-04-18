<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String uid = request.getParameter("uid");
	String upw = request.getParameter("upw");
	
	UserDAO dao = new UserDAO();
	
	int result = dao.login(uid, upw);
	
	if(result == 1){ // 실패 케이스1 아이디가 아예없다.
		response.sendRedirect("useradd.jsp"); // 회원가입으로
	} else if(result == 2){
		response.sendRedirect("login.jsp"); // 비밀번호가 틀린케이스 이므로 다시 로그인
	} else {
		session.setAttribute("id", uid);
		response.sendRedirect("/product/productlist.jsp");
	}

%>