<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String memo = request.getParameter("memo");
String uid = "test";

MemoDAO dao = new MemoDAO();

dao.insert(memo, uid);

response.sendRedirect("main.jsp");

%>