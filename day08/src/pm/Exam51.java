package pm;

public class Exam51 {

	public static void main(String[] args) {
		// 메서드 오버라이딩 method overriding
		// 메서드 덮어쓰기
		// 부모 클래스에게 상속 받은 메서드와 동잃한 이름의 메서드를 재정의하는 것
		// 1. 부모클래스의 메서드와 타입과 개수가 동일해야 한다.
		// 2. 부모클래스의 메서드보다 접근 지정자의 범위가 같거나 넓어야 한다.
		
		/*
		 * class A {
		 * 		void print() {
		 * 			System.out.println("A클래스");
		 * 		}
		 * }
		 * 
		 * class B extends A{
		 * 		void print(){
		 * 			System.out.println("B클래스");
		 * 		}
		 * }
		 * 
		 * 오버 라이딩을 덮어쓰기라고 표현은 했찌만 사실 차이가 있다.
		 * 덮어쓰기는 이전 내용이 완전히 삭제되고 새로운 내용으로 바뀌는 개념이지만,
		 * 오버라이딩은 이전 print()메서드 위에 새로운 메서드가 올라타는 개념이다.
		 * 사실은 부모의 print()메서드를 강제로 호출할 수도 있다.
		 * 
		 * 메서드 오버라이딩을 사용하는 이유
		 * 
		 * class Animal{
		 * 		void cry(){
		 * 			
		 * 		}
		 * }
		 * 
		 * class Bird extends Animal{
		 * 		void cry(){
		 * 			System.out.println("짹짹");
		 * 		}
		 * }
		 * 
		 * class Cat extends Animal{
		 * 		void cry(){
		 * 			System.out.println("야옹");
		 * 		}
		 * }
		 * 
		 * class Dog extends Animal{
		 * 		void cry(){
		 * 			System.out.println("멍멍");
		 * 		}
		 * }
		 * 
		 * Bird bird = new Bird();
		 * Cat cat = new Cat();
		 * Dog dog = new Dog();
		 * 
		 * bird.cry(); // 짹짹
		 * cat.cry(); // 야옹
		 * dog.cry(); // 멍멍
		 * 
		 * 모든 객체를 부모 타입 한가지로 선언하면 배열로 한번에 관리할 수 있는 장점이 있다.
		 * 
		 * Animal[] animals = new Animals{bird, cat, dog}
		 * 
		 */
		
		
		
		
		Q q = new Q(); // Q 자료형 Q 생성자
		q.print();
		
		W w = new W(); // W 자료형 W 생성자 
		w.print();
		
		Q qw = new W(); // Q 자료형 / W 생성자
		qw.print();
	}

}

class Q{
	void print() {
		System.out.println("Q클래스");
	}
	
}


class W extends Q{
	void print() {
		System.out.println("W 클래스");
	}
}










