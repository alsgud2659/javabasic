package am;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// 배열, 반복, 조건
		// 주석, 클래스, 객체
		
		A t = new A();
		System.out.println(Arrays.toString(t.index()));
	}

}


class A{
	public static int[] index() {
		int[] a = {1,3,4,5,6};
		int[] b = new int[2];
		for (int i = 0; i < a.length - 1; i++) {
			if((a[i] + a[i + 1]) % 2 == 0) {
				b[i] = i;
				b[i + 1] = i + 1;
			}
			
		}
		return b;
	}
}