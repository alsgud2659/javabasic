<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- CSS only -->
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
		crossorigin="anonymous">
<%@ include file="menu.jsp"%>
<div class = "container bg-light shadow mx-auto mt-5 p-5 w-75">
<form>
<div class="alert alert-primary" role="alert">  
<p class="text-center"> 로그인 성공! </p>
</div>
<%@ include file="database_connect.inc" %>
<%
// DB 검색
	String hakbun = request.getParameter("hakbun");
	String sql = "SELECT * FROM student WHERE hakbun = ?";
	pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, hakbun);
	rset = pstmt.executeQuery();
	
// 1 아이디가 DB에 없는 경우
// 2 아이디는 있는데 비밀번호가 틀리는 경우

// 3 아이디와 비번 모두 일치하는 경우 (로그인 승인)

// 질의 결과 확인
	if(!rset.isBeforeFirst()) {
		out.print("<script>alert('존재하지 않는 학생입니다!');"
		+ "history.back();"
		+ "</script>");
	}else{
	out.print("학생 정보 검색 성공!<br>");
	
	rset.next();	// 다음, 즉 첫번째로 이동
	
	String db_hakbun = rset.getString("hakbun");
	String db_name = rset.getString("name");
	
	if(hakbun.equals(db_hakbun)){
		session.setAttribute("hakbun", db_hakbun);
		session.setAttribute("name", db_name);
	}
	out.print(session.getAttribute("hakbun") + "(" + session.getAttribute("name") + ") 님의 방문을 환영합니다. <br>");
	}
%>
<%@ include file="database_close.inc" %>
</div>
<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>