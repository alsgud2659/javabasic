<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "org.apache.commons.fileupload.*" %>
<%@ page import = "org.apache.commons.fileupload.disk.*" %>
<%@ page import = "org.apache.commons.fileupload.servlet.*" %>
<%@ page import = "java.util.*" %>
<%@ page import = "jdbc.*" %>
<%@ page import = "util.FileUtil" %>

<%
request.setCharacterEncoding("utf-8");

String nimgname=request.getParameter("nimage");
String nid = null;
String ntitle = null;
String ncontent = null;
String nuser = null;
String ndate = null;
String nimg= null; // 이미지 파일 이름
byte[] nfile =null; // 실제 이미지 파일 


// 추출값들을 객체 형태로 저장할 준비
ServletFileUpload sfu = new ServletFileUpload(new DiskFileItemFactory());

// 입력된 값들을 추출하여 객체에 저장 
List items =sfu.parseRequest(request);

// 순차적으로 접근하기 위한 객체 생성 
Iterator iter = items.iterator();

if(nimgname != null){
while(iter.hasNext()){ // 요소가 있으면 계속 반복 없으면 종료 
	FileItem item =(FileItem) iter.next(); // 요소에 순차적으로 접근하여 하나씩 추출하여 저장 
	String name = item.getFieldName(); // 요소의 이름을 추출 
	if(item.isFormField()){ // 이름과 값형태 즉 map형태로 구성이 되있는지 확인 넘겨준 값들에서 맵형태면 원하는 값들이 뭉쳐있는것
		//  텍스트 추출
		String value = item.getString("utf-8");
		if(name.equals("nid")) nid = value;
		else if(name.equals("ntitle")) ntitle = value;
		else if(name.equals("ncontent")) ncontent = value;
		else if(name.equals("nuser")) nuser = value;
		else if(name.equals("ndate")) ndate = value;
	}else{
		// 사진 추출
		if(name.equals("bimgs")){
			nimg = item.getName();  // 사진이름
			nfile = item.get();		 // 사진내용 
			String root = application.getRealPath(java.io.File.separator);
			FileUtil.saveImage(root, nimg, nfile);
		}
	}
}

NoticeDAO dao = new NoticeDAO();
if(dao.insert(nid,nuser,ntitle,ncontent,nimg,ndate)){
	response.sendRedirect("board.jsp");
}
}else{ // 사진을 업로드하지 않는경우
	while(iter.hasNext()){ // 요소가 있으면 계속 반복 없으면 종료 
		FileItem item =(FileItem) iter.next(); // 요소에 순차적으로 접근하여 하나씩 추출하여 저장 
		String name = item.getFieldName(); // 요소의 이름을 추출 
		if(item.isFormField()){ // 이름과 값형태 즉 map형태로 구성이 되있는지 확인 넘겨준 값들에서 맵형태면 원하는 값들이 뭉쳐있는것
			//  텍스트 추출
			String value = item.getString("utf-8");
			if(name.equals("nid")) nid = value;
			else if(name.equals("ntitle")) ntitle = value;
			else if(name.equals("ncontent")) ncontent = value;
			else if(name.equals("nuser")) nuser = value;
			else if(name.equals("ndate")) ndate = value;
		}
		
	}
	NoticeDAO dao_noimg= new NoticeDAO();
	if(dao_noimg.insert(nid,nuser,ntitle,ncontent,nimgname,ndate)){
		response.sendRedirect("noticelist.jsp");
	}
}
%>