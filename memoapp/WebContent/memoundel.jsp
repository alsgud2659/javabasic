<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String mid = request.getParameter("mid");
String uid = "test";

MemoDAO dao = new MemoDAO();

dao.undelete(mid);

response.sendRedirect("main.jsp");

%>