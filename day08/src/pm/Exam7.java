package pm;

public class Exam7 {

	public static void main(String[] args) {
		// super 키워드 	super()메서드
		
		// this 키워드와 this()메서드는 클래스 내부의 특정 구성요소 (생성자, 객체)를 호출할때 사용했다.
		// 생략하면 자동으로 추가해 주기도 했다.
		// 이와달리 super는 모두 부모클래스와 관련이 있다. 따라서 상속관계에서만 사용할 수 있다.
		
//		J j = new J();
//		j.bcd();
		
		H j = new J();
		j.abc();
	}

}

class H {
	void abc() {
		System.out.println("H클래스의 abc()");
	}
}

class J extends H {
	void abc() {
		System.out.println("J클래스의 abc()");
	}
	void bcd() {
		abc();
		//super.abc();
	}
}