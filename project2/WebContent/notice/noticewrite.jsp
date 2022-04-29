<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 작성</title>
</head>
<body>
<% //글을 보는거는 로그인 세션없어도 볼수 있게하기..
//id = 로그인한 사람 고유번호 123
	String id = (String) session.getAttribute("uid"); //로그인 한 사람의 id=buser
	if(id==null){
		id = (String) session.getAttribute("uid");
	}
	
	int nid = 0; //글의 고유번호
	if(request.getParameter("nid")!=null){ //28  =bid
		nid = Integer.parseInt(request.getParameter("nid"));
	}
	
%>

<%!// 선언문
	String title = "공지사항 내용";%>
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
	<form action="noticeadddb.jsp" method="post" enctype="multipart/form-data">

			<div class="form-group row">
				<label class="col-sm-2">작성자</label>
				<div class="clo-sm-3">
					<input type="text" name="nuser" value="<%=id %>" class="form-control">
				</div>
			</div>
			
			<div class="form-group row">
				<label class="col-sm-2">게시물 제목</label>
				<div class="clo-sm-3">
					<input type="text" name="ntitle" class="form-control">
				</div>
			</div>	
					
			<div class="form-group row">
				<label class="col-sm-2">게시물 내용</label>
				<div class="clo-sm-3">
					<textarea name="ncontent" cols="50" rows="8" class="form-control"></textarea>
				</div>
			</div>
									
			<div class="mb-3">
				<label for="formFileSm" class="form-label">사진</label> 
				<input name="nimage" class="form-control form-control-sm" id="formFileSm" type="file">
			</div>

			<div class="form-group row" align="center">
				<div class="clo-sm-10">
					<input type="submit" name="nimage" class="btn btn-primary" value="등록">
					<input type="reset"  class="btn btn-danger" value="취소" >
				</div>
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