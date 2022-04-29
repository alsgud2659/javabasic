<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 수정</title>
</head>
<body>
	<%
		//id = 로그인한 사람 고유번호 123
	String id = (String) session.getAttribute("uid"); //로그인 한 사람의 id=buser
	if (session.getAttribute("uid") == null) {
		response.sendRedirect("/user/login.jsp");
	}
	int nid = 0; //글의 고유번호 28
	if (request.getParameter("nid") != null) { //69  =bid
		nid = Integer.parseInt(request.getParameter("nid"));
	}
	%>
	<%!// 선언문
	String title = "공지사항 수정";%>
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

<%
	// 수정할때 작성자가 다르면.
	NoticeDTO notices = (new NoticeDAO()).getDetail(request.getParameter("ncontent"));
	UserDTO user = (new UserDAO()).getName(id);
	%>



	<div class="container" style="padding-top: 30px;">
		
	<form action="noticeupdatedb.jsp" method="post" >
			
			
			<div class="form-group  row">
				<label class="col-sm-2">글번호</label>
				<div class="col-sm-4">
					<input type="text" value="<%=nid%>" name="nid"
						class="form-control" maxlength="50 ">
				</div>
			</div>
			
			<div class="form-group  row">
				<label class="col-sm-2">제목</label>
				<div class="col-sm-4">
					<input type="text" value="<%=notices.getNtitle().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt").replaceAll(">", "&gt")%>" name="ntitle"
						class="form-control" maxlength="50 ">
				</div>
			</div>

			<div class="form-group  row">
				<label class="col-sm-2">작성자</label>
				<div class="col-sm-4">
					<td><%=notices.getNuser()%></td>
				</div>
			</div>

			<div class="form-group  row">
				<label class="col-sm-2">작성일자</label>
				<div class="col-sm-4">
					<td><%=notices.getNdate()%></td>
				</div>
			</div>

			<div class="form-group row">
				<label class="col-sm-2">내용</label>
				<div class="col-sm-3">
					<textarea class="form-control" name="ncontent" maxlength="2048"
						style="height: 350px; width: 400px;"><%=notices.getNcontent().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt").replaceAll(">", "&gt")%></textarea>
				</div>
			</div>


			<%
				String img = request.getParameter("nimage");
				String imgstr = "";

				if (img != null) {
					imgstr = "<img src='../images/" + img + "' style='width:100%'>";
				}
			%>
			<div class="form-group  row">
				<label class="col-sm-2">첨부파일 <%=imgstr %></label>
				<div class="col-sm-4">
					<input name="nimg" type="file" class="form-control">
				</div>
			</div>

			<div class="col-sm-offset-5 col-sm-5">
				<a href="noticelist.jsp" class="btn btn-primary">목록</a>
				<%
					// 로그인이 되어있고, 글의 작성자와 로그인된 네임이 같으면 수정 삭제 보이기.
				if (id != null && request.getParameter("nuser").equals(id)) {
				%>
				<input type="submit" class="btn btn-primary pull-right" value="수정 확인">
				<%
					}
				%>
			</div>
		</form>


	</div>






	<%@ include file="/_footer.jsp"%>
	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>