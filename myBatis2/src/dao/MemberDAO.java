package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.MyBatisConfig;
import vo.MemberVO;

public class MemberDAO {
	SqlSessionFactory sqlSession_f = MyBatisConfig.getSqlsession_f();
	SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = sqlSession_f.openSession(true);
	}
	// 아이디 중복검사
	public boolean checkId(String id) {
		// 제네릭 타입을 parseInt()에 전달하면 문자열이 아닌 값을 전달했기 때문에 오류가 발생한다.
		// 이럴떄는 Down Casting을 사용하여 Integer로 형변환을 해준다
		return (Integer)sqlSession.selectOne("Member.checkId", id) == 1;
	}
	
	// 회원가입
	public void join(MemberVO member) {
		sqlSession.insert("Member.join", member);
	}
	
	// 로그인
	public boolean login(String id, String pw) {
		HashMap<String, String> loginMap = new HashMap<>();
		loginMap.put("id", id);
		loginMap.put("pw", pw);
		return (Integer)sqlSession.selectOne("Member.login", loginMap) == 1;
	}
	
	// 이름 수정
	public boolean update(MemberVO member) {
		return sqlSession.update("Memeber.modify", member) == 1;
	}
	
	// 회원 탈퇴
	public boolean delete(String id) {
		return sqlSession.delete("Member.remove", id) == 1;
	}
	
	// 아이디 조회 (이름과 비밀번호)
	public String findId(String name, String pw) {
		HashMap<String, String> findIdMap = new HashMap<>();
		findIdMap.put("name", name);
		findIdMap.put("pw", pw);
		return sqlSession.selectOne("Member.findId", findIdMap);
	}
	
	// 나이조회 (20세가 아닌 고객)
	public List<MemberVO> findMember() {
		return sqlSession.selectList("Member.findMember");
	}
	
}


















