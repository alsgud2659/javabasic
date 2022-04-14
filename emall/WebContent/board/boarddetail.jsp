<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!// 선언문
	String title = "글 내용보기";%>
	<!-- CSS only -->
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
		crossorigin="anonymous">

	<%@ include file="/_header.jsp"%>

	<div class="alert alert-secondary" role="alert">
		<div class="container">
			<h1 class="display-3">
				<%=title%></h1>
		</div>
	</div>

	<%
		String bid = request.getParameter("bid");

		BoardDTO board = (new BoardDAO()).getDetail2(bid);
	%>

	<div class="container">
		<div class="row">
			<div class="col-ma-6">
				<p>
					<b>작성자 : <%=board.getBuser()%></b>
				</p>
				<p>
					<b>작성시간 : <%=board.getBdate()%></b>
				</p>
				<p>
					<b>글 내용 </b><tr>
					<%=board.getBcontent() %>
				</p>
				
				<a href="boardlist.jsp" class="btn btn-secondary">글 목록</a>
				<a href="boardwrite.jsp" class="btn btn-secondary">글작성</a>
			</div>
		</div>
	</div>







	<%@ include file="/_footer.jsp"%>
	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>