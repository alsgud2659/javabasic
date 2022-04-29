package jdbc;

import java.sql.*;

import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class UserDAO {
	//회원가입
	public boolean insert(String userid, String userpw, String username) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "INSERT INTO user(userid, userpw, username) VALUES (?,?,?)";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, userid);
				pstmt.setString(2, userpw);
				pstmt.setString(3, username);
			int result = pstmt.executeUpdate();
			
			return (result == 1) ? true : false;			
			
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}
	
	//회원확인
	public boolean exists(String userid) throws NamingException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT userid FROM user WHERE userid=?";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			return rs.next();			
			
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}
	
	//회원 탈퇴
	public boolean delete(String userid) throws NamingException, SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "DELETE FROM user WHERE userid=?";
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, userid);
			int result = pstmt.executeUpdate();
			
			return (result == 1) ? true:false;			
			
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}
	
	//로그인
	public int login(String userid, String userpw) throws NamingException, SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT userid, userpw FROM user WHERE userid = ?";
			
			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,userid);
			rs = pstmt.executeQuery();
			
			if(!rs.next()) return 1;					   // 회원이 아닌 경우
			if(!userpw.equals(rs.getString("userpw"))) return 2; // 암호가 틀린 경우
			
			return 0;
			
		}finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	}
	
	//로그아웃
	public boolean logout() {
		return true;
	}
	
}
