package pm;

public class Exam41 {

	public static void main(String[] args) {
		// final 메서드와 final class 
		// final 변수는 변수가 저장된 값이 최종값의 의미를 가진 것처럼 final 메서드와 final 클래스도 각각 최종 메서드 최종 클래스의 의미를 가진다.
		// 최종 메서드의 의미는 상속할 때 부모의 메서드를 오버라이딩하면 자식 클래스에서는 메서드의 기능이 변경되지만,
		// fianl메서드는 메서드의 기능을 변경할 수 없는 메서드이다. 즉, 메서드를 final선언하면 자식클래스에서 해당 메서드를 오버라이딩 할 수 없다.
		
		// final 변수는 값을 변경할 수 없고
		// final 메서드는 오버라이딩 할 수 없고
		// final 클래스는 상속 받을 수 없다.
		
		/*
		 * class A{
		 * 		void abc(){
		 * 	
		 * 		}
		 * 		final void bdc(){}
		 * }
		 * 
		 * class B extends A {
		 * 		void abc(){ // 부모의 abc() 메서드를 오버라이딩
		 * 					
		 * 		}
		 * 		void bdc(){ // 에러 발생 오버라이딩 할 부모클래스의 메서드에 final이 걸려있다.
		 * 
		 * 		}
		 * }
		 * 
		 */

	}

}


class AA{
		void abc(){
	
		}
		final void bdc(){}
}

class BB extends AA {
		void abc(){ // 부모의 abc() 메서드를 오버라이딩
					
		}
		//void bdc(){ // 에러 발생 오버라이딩 할 부모클래스의 메서드에 final이 걸려있다.

		//}
}

final class C {
	
}
//class D extends C { // final로 선언한 클래스는 상속할 수 없다.
	
//}