package pm;

public class Exam6 {

	public static void main(String[] args) {
		// 외부 클래스 external class
		// public 클래스의 외부에 추가로 정의한 클래스를 말한다.
		// 1개의 자바 소스 파일에는 최대 1개의 public 클래스만 존재할 수 있고,
		// 그 클래스명은 파일명과 일치 해야 한다.
		// 즉 1개의 소스파일 안에 public 클래스를 제외한 모든 클래스는 외부 클래스이다.
		// public 클래스가 아니면 다른 클래스에서 임포트 할 수 없으므로 외부 클래스는 같은 패키지 안에서만 사용할 수 있다.
		
		
		// 다른 패키지 am 패키지 내의 class B 는 public 선언이 불가능한 외부 클래스 이기 때문에
		// 다른 패키지에서는 불러올 수 없다.
		// am.B b = new B();
		// b.print();
	}

}

