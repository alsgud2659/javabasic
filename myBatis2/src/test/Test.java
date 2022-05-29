package test;

import dao.MemberDAO;
import vo.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAO();
		
		vo.setId("alsgud4526");
		vo.setPw("1234");
		vo.setName("홍길동");
		vo.setAge(25);
		
		dao.findMember().forEach(member -> {
			System.out.println(member.getId() + ",");
			System.out.println(member.getName() + ",");
			System.out.println(member.getPw() + ",");
			System.out.println(member.getAge() + ",");
		});
		
//		if(dao.delete("alsgud4526")) {
//			System.out.println("회원탈퇴 성공");
//		}
		
//		System.out.println(dao.findId("홍길동", "1234"));
		
//		if(dao.modify (vo)) {
//			System.out.println("수정 성공");
//		}
//		if(dao.checkId(vo.getId())) {
//			dao.join(vo);
//		}
//		
//		if (dao.login("alsgud4526", "1234")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
	}
}
