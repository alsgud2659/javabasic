package pm;

public class Exam61 {

	public static void main(String[] args) {
/*
 * class A{
 * 		void print1(){
 * 			System.out.println("A클래스 print1");
 * 		}
 * 
 * 		void print2(){
 * 			System.out.println("A클래스 print2");
 * 		}
 * }
 * 
 * class B extends A {
 * 		void print1(){	// 메서드 오버라이딩
 * 			System.out.println("B클래스 print1");
 * 		}
 * 
 * 		void print2(int a){ // 메서드 오버로딩
 * 			System.out.println("B클래스 print2");
 * 		}
 * }
 * 
 */
		
		P p = new P();
		p.print1();
		p.print2();
		System.out.println();
		
		O o = new O();
		o.print1();
		o.print2();
		o.print2(1);
		System.out.println();
		
		P po = new O();
		po.print1();
		po.print2();
		// po.print2(3); 

	}

}

class P {
	void print1() {
		System.out.println("P클래스 print1");
	}
	void print2() {
		System.out.println("P클래스 print2");
	}
}

class O extends P{
	@Override // @ 에너테이션은 컴퓨터도 읽는 주석
	void print1() {
		System.out.println("O클래스 print1");
	}
	void print2(int a) {
		System.out.println("O클래스 print2");
	}
}














