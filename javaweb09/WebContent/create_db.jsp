<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
Class.forName("com.mysql.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/";
String id = "root";
String pw = "0000";

Connection conn = null;				// 연결 객체
PreparedStatement pstmt = null;		// 구문 객체

conn = DriverManager.getConnection(url, id, pw);
out.print("SQL DB 연결 성공!! by 24이민형 <br>");

String sql = "CREATE DATABASE school";

pstmt = conn.prepareStatement(sql);		// 구문을 객체에 넣어서

pstmt.executeUpdate();					// 구문 객체 실행
	
out.print("univ 데이터베이스 생성 성공!! <br>");

out.print("univ 데이터베이스 생성 실패!! <br>");

// 데이터베이스 연결 종료
if(conn != null){	
	conn.close();
	out.print("SQL DB 연결 종료!!<br>");	
}

%>
    