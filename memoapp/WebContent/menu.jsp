<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div class="btn-group" role="group"
			aria-label="Button group with nested dropdown">
			<a href="main.jsp" class="btn btn-primary">메모 보기</a> <a
				href="memodellist.jsp" class="btn btn-primary">삭제 메모</a>

			<div class="btn-group" role="group">
				<button id="btnGroupDrop1" type="button"
					class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown"
					aria-expanded="false">회원</button>
				<ul class="dropdown-menu" aria-labelledby="btnGroupDrop1">
					<li><a class="dropdown-item" href="userjoin.jsp">회원가입</a></li>
					<li><a class="dropdown-item" href="userbye.jsp">회원탈퇴</a></li>
					<li><a class="dropdown-item" href="userlogin.jsp">로그인</a></li>
					<li><a class="dropdown-item" href="userlogout.jsp">로그아웃</a></li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>