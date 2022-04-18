<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");	

	String[] item = request.getParameterValues("hobby");

	if(item != null){
		for(int i = 0; i < item.length; i++){
			out.print(item[i] + "<br>");
		}
	}
	


%>
</body>
</html>