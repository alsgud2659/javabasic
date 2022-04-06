<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 임시 고객정보 DB
	String user_id = "root";
	String user_pw = "admin";
	String user_name = "24이민형";
	
	// login_form에서 입력한 값을 받아옴
	String cust_id = request.getParameter("cust_id");
	String cust_pw = request.getParameter("cust_pw");
	
	// DB에 있는 비밀번호와 입력한 비밀번호를 비교하여 로그인 승인
	if((cust_id.equals(user_id)) && (cust_pw.equals(user_pw))){
		session.setMaxInactiveInterval(600); // 10분
		session.setAttribute("cust_id", user_id);
		session.setAttribute("cust_name", user_name);
		
		out.print("<b>" + session.getAttribute("cust_id") + "(" + session.getAttribute("cust_name") + ")님 방문을 환영합니다!" + "</b><p>");
	}else{
		out.print("로그인 후 사용하세요 <p>");
		// response.sendRedirect("login_form.jsp");
		
	}
%>

	<a href="login_form.jsp">[로그인 폼]</a>
	<a href="logout.jsp">[로그아웃]</a>
	
</body>
</html>