package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(a);
		Arrays.sort(b);
		int sum = 0;
		int min = a[0];
		int max = b[b.length - 1];
		int temp = 0;
		
		for (int i = 0; i < k; i++) {
			if(min < max) {
				temp = min;
				min = max;
				max = temp;
			}
			a[0] = min;
			b[b.length-1] = max;
			Arrays.sort(a);
			Arrays.sort(b);
			min = a[0];
			max = b[b.length - 1];
		}
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
	}
}
