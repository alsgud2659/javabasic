package pm;

class FoolException extends RuntimeException {
	// 디폴트 생성자를 자동으로 만들어준다.
	// 상속을 받고 있으므로 자동으로 부모의 생성자롤 호출한다. super();
}
public class Exam7 {

	public void sayNick(String nick) {
		try {
		if ("fool".equals(nick)) {
			throw new FoolException();
		}
		System.out.println("당신의 별명은 " + nick + "입니다.");
		}catch(FoolException e) {
			System.out.println("FoolException이 발생했습니다.");
		}
	}
	public static void main(String[] args) {
		Exam7 sample = new Exam7();
		sample.sayNick("fool");//예외가 발생했지만 처리 했기 때문에
		sample.sayNick("genious");//잘 실행된다.  

	}

}
