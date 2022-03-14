package pm;

public class Exam5 {

	public static void main(String[] args) {
		// 객체의 타입 변환
		// 기본자료형에서 보았듯이 '='을 사용하여 왼쪽과 오른쪽의 자료형이 일치해야 한다.
		// 민약 자료형이 다르면 자바가 자동으로 타입을 변환해 주거나 개발자가 명시적으로 타입을 변환해야 한다.
		
		// 객체에서는 자식클래스에서 부모클래스쪽으로 변환되는것이 업캐스팅
		// 그 반대는 다운 캐스팅이다.
		// 객체는 항상 업캐스팅은 할 수 있으므로 명시적으로 적어주지 않아도 자바가 대신 해준다.
		// 하지만 객체 명시적으로 적어줘도 다운캐스팅 자체가 안될 때가 있다.
		// 잘못된 다운캐스팅을 수행하면 ClassCastException이 발생하고 프로그램이 종료된다.
		
		// 사람	학생은 사람이다(항상 참)	      업캐스팅
		// 학생	사람은 학생이다(항상 참은 아님)  다운캐스팅
		
		// 사람 human1 = new 사람();	학생과 학생이 아닌 사람 모두 포함되는 객체
		// 사람 human2 = new 학생();	학생인 사람 객체
		
		// 사람() 생성자를 이용해 객체를 생성하고 사람 자료형에 대입했다.
		// 학생() 생성자를 이용하여 객체를 생성하고 역시 사람 자료형에 대입했다.
		// 둘 다 사람 타입의 자료형이다. 하지만 내용은 다르다.
		// 첫번째 human1 객체는 사람 클래스로 만들어 졌기 때문에 여기에는 사람의 공통된 속성과 기능들만 포함되어있다.
		// 그렇기 때문에 학생으로의 다운 캐스팅은 불가능하다.
		// 반면에 human2는 실제 학생() 생성자로 객체를 생성했으므로 객체 내부에는 사람의 공통된 특성 뿐만 아니라 학생만의 속성과 기능들이 포함되어 있다.
		// 따라서 human2도 사람 자료형으로 저장되어있지만 학생으로 다운 캐스팅이 가능하다.
		
		// class A {}			할아버지
		// class B extends A{}	아버지
		// class C extends B{}	손자
		
		// 업캐스팅 - 학생은 언제나 사람이 될 수 있다.
		// B b1 = new B();
		// A a1 = (A) b1;	A a1 = b1; ok
		
		
		// C c2 = new C();
		// B b2 = (B) c2;	B b2 = c2; ok
		// A a2 = (A) c2;	A a2 = c2; ok
		
		// 다운캐스팅
		// A a1 = new A();
		// B b1 = (B) a1; // 에러발생
		
		// A a2 = new B();
		// B b2 = (B) a2; // 가능, 다운캐스팅은 경우에 따라 될 수도 있다.
		// C c2 = (C) a2; // 에러
		
		// 무슨 타입으로 선언되어 있는지는 중요하지 않고 어떤 생성자로 생성됐는지가 중요하다.
		// B() 생성자로 만들었으면 A로 캐스팅 할 수 있고, C()로 만들었다면 A와 B로 캐스팅 할 수 있다.
	}

}
