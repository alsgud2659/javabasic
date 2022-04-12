<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@page import="jdbc.FeedDAO"%>
<%@page import="util.FileUtil"%>
<% request.setCharacterEncoding("utf-8");

String uid = request.getParameter("uid");
String ucon = request.getParameter("ucon");

//추출할 변수값 초기화
String ufname = null;
byte[] ufile = null;

ServletFileUpload sfu = new ServletFileUpload(new DiskFileItemFactory());
List items = sfu.parseRequest(request);
Iterator iter = items.iterator();

while(iter.hasNext()){
	FileItem item = (FileItem) iter.next();
	String name = item.getFieldName();
	if(item.isFormField()){
		// 텍스트를 추출
		String value = item.getString("utf-8");
		if(name.equals("uid")) uid = value;
		else if (name.equals("ucon")) ucon = value;
	} else {
		// 사진을 추출
		if(name.equals("uimage")){
			ufname = item.getName(); // 사진이름
			ufile = item.get();	     // 사진내용
			// 서버에 사진 저장
			String root = application.getRealPath(java.io.File.separator);
			FileUtil.saveImage(root, ufname, ufile);
		}
	}
}

FeedDAO dao = new FeedDAO();
if(dao.insert(uid, ucon) || dao.insert(uid, ucon, ufname)){
	response.sendRedirect("main.jsp");
} else {
	out.print("글 작성중 에러 발생");
}



%>

