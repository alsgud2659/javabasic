<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   request.setCharacterEncoding("UTF-8");

// JDBC 드라이버 로딩
   Class.forName("com.mysql.jdbc.Driver");
// DB연결
   String url = "jdbc:mysql://localhost:3306/school";
   String id = "root";
   String pw = "0000";
   
   Connection conn = null;  // 디비 연결 객체
   PreparedStatement pstmt = null; // 디비에 전달할 SQL 구문객체
   
   conn = DriverManager.getConnection(url, id, pw);
   
// 테이블 데이터 넣는 SQL

   String emp_id = request.getParameter("emp_id");
   String name = request.getParameter("name");
   String department = request.getParameter("department");
   
   String sql = "INSERT INTO emp VALUES(?,?,?)";
   pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, emp_id);
      pstmt.setString(2, name);
      pstmt.setString(3, department);
      
   pstmt.executeUpdate(); 
   
   
// DB 연결 종료
   if (pstmt != null) pstmt.close();
   if (conn != null) conn.close();

%>