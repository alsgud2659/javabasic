package pm;
import am.A;
public class Exam7 {
	public int a = 1;
	protected int b = 2;
	int c = 3; // default
	private int d = 4;
	void abc() { // default
		
	}
	public static void main(String[] args) {
		// 접근 제어자(지정자) modifier는 클래스, 필드, 메서드, 생성자 등에게
		// 어떠한 특징을 부여하는 문법 요소이다. 일종의 형용사로 생각할 수 있음
		// 사용범위를 정의하는 역할을 한다.
		// public   >    protected   >   default(아무 표시가 없을 때)   >   private
		
		// public    :  같은 패키지 내의 모든 클래스 + 다른패키지의 모든 클래스에서 접근 가능
		// protected :  같은 패키지 내의 모든 클래스 + 다른패키지의 자식 클래스에서 접근 가능
		// default   :  같은 패키지 내의 모든 클래스
		// private   :  같은 클래스에서만 사용 가능
		A a = new A();
		a.print();
		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);
//		System.out.println(a.d);  //private 접근 지정자로 지정된 필드는 접근 불가능
		System.out.println();
	}

}
