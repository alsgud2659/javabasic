package pm;

import am.A;

public class C {
	public void print() {
		A a = new A();
		// 사용
		System.out.println(a.a);
		//System.out.println(a.b);  // protected :  같은 패키지 내의 모든 클래스 + 다른패키지의 자식 클래스에서 접근 가능
		//System.out.println(a.c);  // default   :  같은 패키지 내의 모든 클래스
		//System.out.println(a.d);  // private 접근 지정자로 지정된 필드는 접근 불가능
	}
}
