<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String uid = (String)session.getAttribute("id");
	if(uid == null){
		response.sendRedirect("/user/login.jsp");
		return;
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 작성</title>
<!— 부스트랩 css  —>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
	
<!— summernote css  —>
<link
	href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css"
	rel="stylesheet">

</head>
<body>
	<%!// 선언문
	String title = "게시판 작성";%>
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


	<div class="container" style="padding-top: 30px;">
		<form name="newProduct" class="form-horizontal"
			action="boardwritedb.jsp" method="post" enctype="multipart/form-data">
			<div class="form-group  row">
				<label class="col-sm-2">제목</label>
				<div class="col-sm-4">
					<input name="btitle" type="text" class="form-control"
						placeholder="Enter the Title">
				</div>
			</div>
			<!-- <div class="form-group  row" style="display: none;">
				<label class="col-sm-2">작성자</label>
				<div class="col-sm-4">
					<input name="bid" type="text" class="form-control" value="test"
						placeholder="Enter the name">
				</div>
			</div> -->
			<div class="form-group row">
				<label class="col-sm-2">내용</label>
				<div class="col-sm-3">
					<textarea name="bcontent" cols="50" rows="8" class="form-control">
					</textarea>
				</div>

			</div>


			<div class="form-group  row">
				<label class="col-sm-2">첨부파일</label>
				<div class="col-sm-4">
					<input name="filename" type="file" class="form-control">
				</div>
			</div>
			<div class="col-sm-offset-5 col-sm-5">
				<input type="submit" class="btn btn-dark" value="글쓰기 "> <input
					type="reset" class="btn btn-dark" value="취소" onclick="reset()">
			</div>

		</form>
	</div>







	<%@ include file="/_footer.jsp"%>
	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.6/summernote.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.6/lang/summernote-ko-KR.min.js"></script>

	
	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
	<!— 부스트랩 js —>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

	<!— 제이쿼리 js—>
	<script type="text/javascript"
		src="//code.jquery.com/jquery-3.6.0.min.js"></script>

	<!— summernote js —>
	<script
		src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>

	<script>
		$('#summernote').summernote({
			placeholder : 'Hello Bootstrap 5',
			tabsize : 2,
			height : 100
		});
	</script>
	
</body>
</html>