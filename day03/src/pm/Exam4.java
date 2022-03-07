package pm;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
//		int num = sc.nextInt();
//		if (num == 0) {
//			System.out.println("입력한 값은 0입니다.");
//		}else {
//			System.out.println("입력한 값이 0이 아닙니다.");
//		}
		
		System.out.print("점수를 입력해 주세요");
		int score = sc.nextInt();
		String result;
		String add;
		if (score >= 90) {
			result = "A";
		}else if (score >= 80) {
			result = "B";
		}else if (score >= 70) {
			result = "C";
		}else if (score >= 60) {
			result = "D";
		}else {
			result = "F";
		}
		
		if (score % 10 >=0 && score % 10 <= 3 && score != 100) {
			add = "-";
		} else if(score % 10 >= 4 && score % 10 <= 6) {
			add = "0";
		}else if(score <= 59){
			add = "";
		}else {
			add = "+";
		}
		
		System.out.println("당신의 학점은 " + result + add + "입니다.");
	}

}
