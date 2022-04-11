package homework;

import java.util.Scanner;

public class Homework29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번째 UglyNumber?:");
		int n = sc.nextInt();
		int[] result = new int[n + 1];
		result[1] = 1; // 첫번째 uglynumber는 1
		int min = Integer.MAX_VALUE; // min에 int형의 가장 큰수를 넣음 (2,147,483,647)
		int p2 = 1; // 2를 곱하는 포인터
		int p3 = 1; // 3을 곱하는 포인터
		int p5 = 1; // 5를 곱하는 포인터를 각각 1로 초기화
		
		for (int i = 2; i < result.length; i++) {
			// result[p2] * 2, result[p3] * 3, result[p5] * 5 값중 가장 작은 값을 min에 넣음
			min = Math.min(Math.min(result[p2] * 2, result[p3] * 3), result[p5] * 5);
			
			// min값이 나온 포인터를 1증가시킴
			if(result[p2] * 2 == min) p2++; 
			if(result[p3] * 3 == min) p3++;
			if(result[p5] * 5 == min) p5++;
			
			// result 배열의 i번째 인덱스에 min값을 넣음
			result[i] = min; 
		}
		
		System.out.println(result[n]); // 결과 출력
	}
}
