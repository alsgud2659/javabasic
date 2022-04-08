package homework;

import java.util.Scanner;

public class Homework28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("울타리의 개수:");
		int k = sc.nextInt();
		System.out.print("색칠할 색의 개수:");
		int n = sc.nextInt();
		
		System.out.println(countWay(k,n));
	}
	// 동적프로그래밍 (Dynamic Programming)
	// 재귀호출로 풀게되면 엄청난 중복호출발생으로 시간이 기하급수적으로 늘게됨
	// dp라는 배열에 1개부터 n개의 울타리를 k가지 색으로 칠하는 방법을 저장해서 n + 1개의 울타리를 색칠하는 가짓수를 구하는데 참고함
	public static int countWay(int n, int k) {
		int[] dp = new int[n + 1]; // 크기가 n + 1인 배열 선언
		
		dp[1] = k; // 울타리가 1개라면 색의 개수가 총 가짓수
		dp[2] = k + k * (k - 1); // 울타리의 개수가 2일때 k개의 색으로 칠하는 가짓수
		
		for (int i = 3; i < dp.length; i++) { //배열 dp를 3번인덱스부터 채워나감
			dp[i] = dp[i - 2] + dp[i - 1] * (k - 1); // n개의 울타리를 k개의 색으로 칠하는 가지수는 f(n) = f(n-1) + f(n-2) * (k-1)
		}
		return dp[n]; // n값을 리턴
	}

}
