package jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.naming.NamingException;

import util.ConnectionPool;

public class NoticeDAO {
	public ArrayList<NoticeDTO> getList() throws NamingException,SQLException{
		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rset =null;
		
		try {
			String sql="SELECT * FROM notice";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			ArrayList<NoticeDTO> notices = new ArrayList<NoticeDTO>();
			while(rset.next()) {
				notices.add(new NoticeDTO(rset.getString("nid"),
									  rset.getString("nuser"),
									  rset.getString("ntitle"),
									  rset.getString("ncontent"),
									  rset.getString("nimage"),
									  rset.getString("ndate")));
			}
			return notices;
			
		}finally {	
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			if(rset != null) rset.close();
		}
	}
	public NoticeDTO getDetail(String ncontent) throws NamingException,SQLException{

		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rset =null;
		
		try {
			String sql="SELECT * FROM notice WHERE ncontent=?";	
			conn = ConnectionPool.get();

			pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ncontent);
			rset = pstmt.executeQuery();
			rset.next();
			String id = rset.getString(1);
			String user = rset.getString(2);
			String title = rset.getString(3);
			String con = rset.getString(4);
			String img = rset.getString(5);
			String date = rset.getString(6);

			
			NoticeDTO notice = new NoticeDTO(id,user,title,con,img,date);
			return notice;
		}	
		finally {	
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			if(rset != null) rset.close();
		}	
	}
	
	public boolean insert(String nid, String nuser, String ntitle, String ncontent, String nimage, String ndate) throws NamingException, SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "INSERT INTO notice(nid,nuser,ntitle,ncontent,nimage,ndate) VALUES(?,?,?,?,?,?)";		
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, null);
			pstmt.setString(2, nuser);
			pstmt.setString(3, ntitle);
			pstmt.setString(4, ncontent);
			pstmt.setString(5, nimage);
			pstmt.setString(6, LocalDate.now().toString());
			
			
			int count = pstmt.executeUpdate();
			return (count >0) ? true : false;
		}finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
	}
	
	public boolean update(int nid, String ntitle, String ncontent, String nimage) 
			throws NamingException, SQLException{
		Connection conn=null;
		PreparedStatement pstmt =null;
		try {
			String sql = "UPDATE notice SET ntitle = ?, ncontent=?, nimage=? WHERE nid=?";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ntitle);
				pstmt.setString(2, ncontent);
				pstmt.setString(3, nimage);
				pstmt.setInt(4, nid);
				
				
				
			int res= pstmt.executeUpdate(); //성공적으로 반환이되면 0 이상의 수를 반환
			return res>0? true:false;
			
			
		} finally {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
		}
	}
	
	public boolean delete(int nid) 
			throws NamingException, SQLException{
		Connection conn=null;
		PreparedStatement pstmt =null;
		try {
			String sql = "DELETE FROM notice WHERE nid=?";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, nid);
			int res= pstmt.executeUpdate(); //성공적으로 반환이되면 0 이상의 수를 반환
			return res>0? true:false;
			
		} finally {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
		}
	}
}
