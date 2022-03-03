package am;

import java.util.Calendar;

public class Exam2 {

	public static void main(String[] args) {
		/*
		 * 연산자의 종류 
		 * 산술 연산자 + - * / % 
		 * 증감 연산자 ++ -- 
		 * 비트연산자 & (and) | (or) 
		 * 비교 연산자 < > <= >=
		 * != == 대입연산자 = += -= *= /= 
		 * 삼항 연산자 (조건식) ? true : false
		 */
		
//		int a = 1;
//		a += 1;
//		a = a + 1;
//		a++; //후위형
//		++a; // 전위형
//		System.out.println(a);
		
		
//		int a = 3;
//		int b = ++a; // a 값을 하나 증가시킨 후의 값을 b에 대입
//		System.out.println(a);
//		System.out.println(b);
//		
//		int c = 3;
//		int d = c++; // 증가시키기 전 값의 c가 먼저 d로 대입되고 나서 c값이 하나 증가
//		
//		System.out.println(c);
//		System.out.println(d);
		
		// 삼항 연산자
		
//		int a = (true) ? 1 : 2;
//		System.out.println(a);
//		
//		int b = (a % 2 == 0) ? 10 : 20;
//		System.out.println(b);
		
//		int value = 3;
//		System.out.println((value % 2 == 0) ? "짝수" : "홀수");
		
		
		int score = 85;
		
		String result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
		
		System.out.println(result);
		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String ampm;
		
		ampm = (hour >= 12) ? "오후" : "오전";
		
		System.out.println("지금 시간은 "+hour+"시 이고, "+ampm+"입니다 ");
	}

}



























