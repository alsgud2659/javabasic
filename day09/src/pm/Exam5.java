package pm;

public class Exam5 {
	public static void main(String[] args) {
		// abstract 추상 - 구체적이지 않다.
		// abstact method - 중괄호가 없는 메서드, 메서드의 기능이 정의되지 않는다
		// 					abstract 리턴타입 메서드명 ();
		
		
		
		
		// 추상 메서드의 장정
		// 일반클래스로 정의를 했을 때와 추상 클래스로 정의 했을 때 자식클래스에서 cry()메서드를 오버라이딩 하는 과정에서 
		// 만약 오타가 발생했다고 가정했을 때, ex)cRy()
		// 이때 일반 클래스를 상속한 자식클래스에서는 오버라이딩이 아니라 추가로 새로운 메서드를 정의한 결과가 된다.
		// 따라서 cry() cRy() 2개의 메서드가 존재하게 된다. 이런 경우 객체를 생성하고 cry()메서드를 호출해도 아무것도 출력되지 않는다.
		// 부보의 cry() 메소드에는 아무것도 정의되지 않았기 떄문이다.
		// 추상 클래스를 생각해보면...
		// 자식클래스가 오버라이딩 하려고 하는 과정에서 오타가 발생하면 문법 오류가 발생한다.
		// 추상 클래스를 상속받으면 추상클래스에 정의해 놓은 추상 메서드들을 구체화한 클래스를 만들어야 한다.
		// 메서드 오버라이딩을 강제하는 방식으로 생각하자
		
		// 겨우 오타찾는 정도의 장점이라고 볼 수 도 있겠지만 여러 사람들이나 여러 회사들이 협업을 하게 되는 경우,
		// 많은 필요성을 느끼게 될것임
		
		// 정리...
		// 만약 abc()라는 추상 메서드를 포함하고 있는 추상 클래스가 있을때 이것을 상속한 모든 자식 클래스는 내부에는 항상 abc()메서드가 정의되어 있어야만 한다.
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
	}
}

abstract class Animal{   // 추상 클래스 선언
	abstract void cry(); // 추상 메서드 선언
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}