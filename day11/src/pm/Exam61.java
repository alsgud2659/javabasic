package pm;

class FoolException extends RuntimeException {
	// 디폴트 생성자를 자동으로 만들어준다.
	// 상속을 받고 있으므로 자동으로 부모의 생성자롤 호출한다. super();
}

public class Exam61 {
	
	public void sayNick(String nick) {
		if ("fool".equals(nick)) {
			throw new FoolException();
		}
		System.out.println("당신의 별명은 " + nick + "입니다.");
		}

	public static void main(String[] args) {
		Exam61 sample = new Exam61();
		sample.sayNick("fool");//예외발생
		sample.sayNick("genious");//실행조차 되지 않는다. 

	}

}