package pm;

public class Exam61 {

	public static void main(String[] args) {
		// 인터페이스 Interface
		// 일반적인 인터페이스의 의미를 생각해보면 입출력 방식의 호환성을 의미한다.
		// 예를들면, 컴퓨터에서 usb프린터, usb마우스, usb키보드 ... 
		// 주변기기의 종류와 상관없이 usb 주변기기면 컴퓨터에 꽂기만 하면 제품을 작동시킬 수 있다.
		
		//interface 이름{}
		
		// 클래스는 1개 이상의 인터페이스를 구형할 수 있다.
		// 클래스는 1개 이상의 클래스를 상속받을 수 없다.

	}

}

interface A {
	public static final int a = 3;
	public abstract void abc();
}