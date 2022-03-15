package pm;

public class Exam4 {

	public static void main(String[] args) {
		// final...필드, 메서드 , 클래스 앞에 위치한다. 의미가 각각 다르다.
		// final 변수 : 변수를 선언할 때만 지정할 수 있고, 한번 대입된 값을 수정할 수 없다.
		// 처음 대입한 값이 최종값이 된다. 변수를 사수로 사용할 떄 사용한다.
		// final은 일단 한번 값이 입력되고 나면 절대로 값을 수정할 수 없다.
		// 생성자라도 더 이상 변경이 불가능하다.

		/*
		 * class A1{ //선언과 동시에 값을 대입 int a = 3; final int b = 5; A1() {} }
		 * 
		 * class A2{ // 선언과 값 대입을 분리 int a; final int b; A2() { a = 3; b = 5; // 대입을 하면서
		 * final이기 때문에 더이상 수정 불가 } }
		 * 
		 * class A3{ int a = 3; final int b = 5; A3(){ a = 7; // a는 변수 b = 9; // 불가능, 한번
		 * 대입하면 바꿀수 없다. } } class B{ void bcd() { int a = 3; final int b = 5; } a = 7; b
		 * = 9; // 불가능
		 * 
		 * }
		 * 
		 * final double c = 3.14; 어떤 필요에 따라서 복사본을 하나 만들어 원본이 삭제된 후에도 그 값을 활용 할 수 있도록 하는
		 * 것이 final의 기능임
		 */
		A1 a1 = new A1();
		A2 a2 = new A2();
		A3 a3 = new A3();
		
		a1.a = 7;
		a2.a = 7;
		//a1.b = 9; // 에러
	}

}

class A1 { // 선언과 동시에 값을 대입
	int a = 3;
	final int b = 5;

	A1() {
	}
}

class A2 { // 선언과 값 대입을 분리
	int a;
	final int b;

	A2() {
		a = 3;
		b = 5; // 대입을 하면서 final이기 때문에 더이상 수정 불가
	}
}

class A3 {
	int a = 3;
	final int b = 5;

	A3() {
		a = 7; // a는 변수
		//b = 9; // 불가능, 한번 대입하면 바꿀수 없다.
	}
}

class B {
	void bcd() {
	 	int a = 3;
	  	final int b = 5;
	
	a=7;
	//b=9; // 불가능
	}
}



