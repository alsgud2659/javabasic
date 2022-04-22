<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정규식</title>
</head>
<body>
<!-- 유효성 검사는 사용자가 입력한 데이터값이 서버로 전송되기 전에 규칙에 맞는지 검사하여 검증하는 것
사용자가 실수로 유효하지 않은 데이터값을 입력하게 되면 부적합하다고 판단하여 다시 입력하도록 알려준다.

아이디 검사, 패스워드 검사, 빈칸 여부... -->
<script type="text/javascript">
function CheckForm(){

	var regExp = /i/i; // var regExp = new RegExp('java','i');
	var str = document.loginForm.title.value;
	var result = regExp.exec(str);
	alert(result[0]);

}

</script>
<form name="loginForm">
제목: <input type="text" name="title">

<input type="submit" onclick="CheckForm()">
</form>
</body>
</html>