package am;

public class Exam2 {
 	/* 
 	 매서드
	 매스드는 클래스의 기능에 해당하는 요소로 클래스 밖에서는 함수라고 부르고 클래스 안에서는 매서드라고 부른다. 
	 매서드는 동작을 정의한다. 예를 들면 공부하기 춤추기 달리기 정지하기
	 
	 클래스 외부에서 매서드 호출 
	 
	 	B b = new B();
		System.out.println(b.m); 
		b.work1();
		
	클래스 내부에서 매서드 호출
		클래스의 내부에 있는 매서드 끼리는 객체를 생성하지 않고 서로를 호출하여 사용할 수 있다. 
		단, 매서드 앞에 static이 붙은 매서드는 static 붙은 필드나 매서드만 호출할수 있다. 
		
		
	매서드 오버로딩
		매서드의 이름이 동일할때 입력되는 매개변수의 개수 또는 자료형에 따라 각각 다른 매서드가 
		실행된다. 
		
		print();
		print(3);
		print(3,4);
		print(3, 3.14);
		
	생성자
		객체를 생성, 1.반드시 클래스 명과 동일해야 한다 2. 리턴이 없다. 리턴형도 없다. 
		개발자가 클래스에 생성자를 만들지 않으면 자동으로 컴파일시에 자바가 기본 생성자를 만들어 준다. 
		따라서 모든 클래스에는 1개 이상의 생성자가 반드시 존재 하게 된다. 
		
		class A{
			A() {
			}
		}
		
		this()매서드 - 자신이 속한 클래스 내부의 다른 생성자를 호출
		             생성자의 내부에서만 사용, 생성자의 첫줄에만 위치해야 한다. 
		
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		
		int a = twice(3);
		System.out.println(a);
	
	}
	
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int a) {
		return a*2;
	}

}

class C {
	C() {
		System.out.println("첫번쨰 생성자");
	}
	C(int a){
		this();
		System.out.println("두번쨰 생성자");
	}
	
//	void abc(){ 매서드에서는 this()를 사용할수 없다. 
//		this(); 
//	}
	
}
