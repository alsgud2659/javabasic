package am;

public class Exam3 {

	public static void main(String[] args) {
		// 제어문 - 조건문 - if, 				switch, (삼항 연산자)
		//		- 반복문 - while, for, 	do ~ while
		
//		if (5 > 3) {
//			System.out.println("출력 1");
//		}
//		
//		
//		int a = 3;
//		if (a == 3) {
//			System.out.println("출력2");
//		}
		
//		if (5 > 3) {
//			System.out.println("안녕");
//			System.out.println("방가");
//		}
//		if (5 > 3) // 괄호를 생략하는것도 가능하지만 언제나 괄호를 사용할 것
//			System.out.println("안녕");
//			System.out.println("방가");
		
//		if (5 > 3) {
//			System.out.println("실행 1");
//		}else {
//			System.out.println("실행 2");
//		}
		
		
		int a = 85;
		if (a >= 95) {
			System.out.println("A");
		}else if (a >= 90) {
			System.out.println("B");
		}else if (a >= 80) {
			System.out.println("C");
		}else if (a >= 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
