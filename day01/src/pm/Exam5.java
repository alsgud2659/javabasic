package pm;

public class Exam5 {

	public static void main(String[] args) {		
		// 변수의 범위
		// 변수의 생존 기간은 메모리에 변수가 만들어진 후 사라지기까지의 기간으로 볼 수있다.
		// 자바는 개발자가 직접 변수를 생성한다. 하지만 변수를 삭제하는 작업은 자바가 알아서 한다.
		// 삭제하는 주체가 개발자가 아니기 때문에 메모리에서 변수가 삭제되는 시점을 이해하는것이 중요하다.
		// 만양 사라진 변수값을 읽거나 값을 대입하려고 하면 문법 오류가 발생한다.
		int value1 = 3; // value1이 생성되는 시점
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		}// value2가 사라지는 시점
		System.out.println(value1);
		//System.out.println(value2);
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		byte value = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		float value5 = 1.3F;
		double value6 = -1.5;
		double value7 = 5;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		
		// char 문자 하나를 저장하는 자료형으로 작은 따옴표를 사용한다.
		
		char a = 'A';
		char b = 65;	// ascii 코드로 문자를 인식
		char c = '\u0041'; // 유니코드로 문자를 인식
		
		
	}// value1이 사라지는 시점
	

}


























