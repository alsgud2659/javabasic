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
<% //글을 보는거는 로그인 세션없어도 볼수 있게하기..
//id = 로그인한 사람 고유번호 123
	String id = (String) session.getAttribute("uid"); //로그인 한 사람의 id=buser
	if(id==null){
		id = (String) session.getAttribute("uid");
	}
	
	
	int nid = 0; //글의 고유번호
	if(request.getParameter("nid")!=null){ //69  =bid
		nid = Integer.parseInt(request.getParameter("nid"));
	}
%>
	<%!// 선언문
	String title = "유저 관리";%>
	<!-- CSS only -->
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
		crossorigin="anonymous">

	<%@ include file="/_header.jsp"%>

	<div class="container">
		<div class="alert alert-info" role="alert">
			<div class="container">
				<h1 class="display-3">
					<%=title%>
				</h1>
			</div>
		</div>
	</div>
	<div class="container bg-light shadow mx-auto mt-5 p-5 w-55">
		<%
			String ncontent = request.getParameter("ncontent");
			NoticeDTO notice = (new NoticeDAO()).getDetail(ncontent);
			String img = notice.getNimage(), imgstr = null;
			if (img != null) {
				imgstr = "<img src='/images/" + img + "'  width=140 height=100 positon:center>";
			} else {
				imgstr = null;
			}
		%>
		<table class="table">

			<tr>
				<h1>
					제목 :
					<%=notice.getNtitle()%></h1>
			</tr>
			<br>
			<br>
			<%
				if (imgstr != null) {
			%>

			<center>
				<tr>
					이미지 :
					<%=imgstr%></tr>
			</center>
			<%
				}
			%>
			<br>
			<br>
			<tr>
				내용 :
				<%=notice.getNcontent()%></tr>
			<br>
			<br>
			<tr>
				작성자 :
				<%=notice.getNuser()%></tr>
		</table>

		<div class="col-sm-offset-5 col-sm-5">
			<a href="noticelist.jsp" class="btn btn-primary">목록</a>
			<%
				// 로그인이 되어있고, 글의 작성자와 로그인된 네임이 같으면 수정 삭제 보이기.
			if (id != null && request.getParameter("nuser").equals(id)) {
			%>
			<a
				href="noticeupdate.jsp?nid=<%=nid%>&ncontent=<%=ncontent%>&nuser=<%=notice.getNuser()%>"
				class="btn btn-primary">수정</a> <a
				onclick="return confirm('정말로 삭제하시겠습니까?')"
				href="noticedeletedb.jsp?nid=<%=nid%>" class="btn btn-primary">삭제</a>
			<%
				}
			%>
		</div>


		<%@ include file="/_footer.jsp"%>
		<!-- JavaScript Bundle with Popper -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
			crossorigin="anonymous"></script>
</body>
</html>