<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숫자인지 여부 검사</title>
</head>
<body>
<!-- 유효성 검사는 사용자가 입력한 데이터값이 서버로 전송되기 전에 규칙에 맞는지 검사하여 검증하는 것
사용자가 실수로 유효하지 않은 데이터값을 입력하게 되면 부적합하다고 판단하여 다시 입력하도록 알려준다.

아이디 검사, 패스워드 검사, 빈칸 여부... -->
<script type="text/javascript">
function CheckForm(){
	
	//if(!isNaN(document.loginForm.id.value.substr(0,1))){
	
	// 첫글자가 소문자인지 확인
	var ch = loginForm.id.value.charAt(0);
	var regExp = /Java/i; // var regExp = new RegExp('java','i');
	if((ch < 'a' || ch > 'z') && (ch > 'A' || ch < 'Z') && (ch > '0' || ch < '9')){
		alert("아이디는 영문 소문자로만 입력가능합니다.");
		document.loginForm.id.select();
		return false;
	}

	form.submit();
}

</script>
<form action="test.jsp" name="loginForm">
아이디: <input type="text" name="id">
비번 : <input type="password" name="pw">
<input type="submit" onclick="CheckForm()">
</form>
</body>
</html>