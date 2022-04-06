<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="add_emp.jsp" method="post">
		<table>
		<caption>사원 정보 입력</caption>
		<tr>
		<th>사번</th>
		<td><input type="text" name="emp_id" required autofocus></td>
		</tr>
		<tr>
		<th>이름</th>
		<td><input type="text" name="name" required></td>
		</tr>
		<tr>
		<th>부서</th>
		<td><input type="text" name="department" required></td>
		</tr>
		<tr>
		<td colspan="2" style="text-align:center"> <input type="submit" value="전송"> </td>
		</tr>
		</table>
	</form>
</body>
</html>