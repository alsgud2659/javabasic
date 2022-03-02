package pm;

public class Exam6 {

	public static void main(String[] args) {
		// 문자 저장 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3'; // 숫자가 아닌 문자 3
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		// 숫자로 문자 저장
		char value4 = 65;
		
		System.out.println(value4);
		
		// 유니코드로 문자 저장
		char value5 = '\u0065';
		System.out.println(value5);
		
		// 형변환 type casting
		// boolean을 제외한 기본 자료형은 서로 형을 변환할 수 있다.
		// 타입 변환을 수행할 때는 저장할 수 있는 값의 범위나 종류가 달라지므로 값이 변화 할 수 있다.
		
		int value11 = (int)5.3;
		
		System.out.println(value11);
		
		float value21 = 3; // int -> float  업캐스팅
		long value22 = 5; // int -> long 업캐스팅
		
		//int value27 = 3.5; // double -> int 다운캐스팅(x)
		int value28 = (int)3.5;
		//float value29 = 7.5; // 실수 기본은 double형 이다.
		float value30 = (float)7.5;
		
		// 자료형 간의 연산
		// boolean 을 제외한 기본 자료형은 서로 연산이 가능하다.
		// 이때 모든 연산은 같은 자료형끼리만 가능하고 연산 결과 역시 같은 자료형이 나온다.
		// 단, int 보다 작은 자료형 간의 연산 결과는 int가 나온다 ex) byte + byte short + short
		// 이유는 cpu
		
		int value41 = 3 + 5;
		int value42 = 8 / 5;
		float value43 = 3.0f + 5.0f;
		double value44 = 8.0 / 5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		
		// byte data3 = data1 + data2; // 결과는 int로 나온다.
		int data4 = data1 + data2;
		
		//int value45 = 5 + 3.5; // 결과가 double 이므로 오류
		double value46 = 5 + 3.5;
		
		double value48 = 5 / 2.0;
		byte data13 = 3;
		short data14 = 5;
		int value49 = data13 + data14;
		double value50 = data13 + data14; // int를 double로 자동 형변환
		
		
		System.out.println((double)(3/2));

	}
	
}


































