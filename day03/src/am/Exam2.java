package am;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		//break 제어 키워드
		
		// break는 {}를 탈출하는 제어 키워드 이다. 일반적으로
		// 반복문에서 특정조건을 만족하는 경우 반복문을 탈출하는데 사용된다.
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				if (j == 3) {
//					break;
//				}
//				System.out.println(i + " " + j);
//			}
//		
//		}
		
		// j 가 3이되면 break 로 탈출하게 되는 반복문은 안쪽의 for이다.
		// 탈출을 한 뒤에도 바깥쪽 for문 내부에 있기 때문에 i값의 변화에 따른 반복은 여전히 유효하다.
		
		
		// 한번에 모든 반복문을 탈출하는 방법
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				if (j == 3) {
//					i = 100;
//					break;
//				}
//				System.out.println(i + " " + j);
//			} // break로 탈출하게되는 중괄호
//		
//		}
		
		
		
		
//		out: // 위치 지정 레이블
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				if (j == 3) {
//					break out;
//				}
//				System.out.println(i + " " + j);
//			} // break로 탈출하게되는 중괄호
//		
//		}
	
		// break out은  out레이블이 위치해 있는 바깥쪽 for문을 완전히 탈출하라는 의미가 된다.
	
	
		// continue 제어 키워드
		// 반복과정에서 특정 구문을 실행하지 않고 건너뛰는 용도로 사용된다.
		
//		for (int i = 0; i < 10; i++) {
//			if (i % 2 != 0) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (j == 3) {
//					continue;
//				}
//				System.out.println(i + " " + j);
//			}
//		}

//		int i = 10;
//		while(i > 0) {
//			System.out.println(i);
//			i -= 2;
//		}
		
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i == 3 && j == 2) {
//					i = 100;
//					break ;
//				}
//				System.out.println(i + " " + j);
//			}
//		}
		
		
		
	}

}















