package pm;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// 가위바위보 게임
		Scanner sc = new Scanner(System.in);
		int comp = (int)(Math.random() * 3) + 1;	
		System.out.println("1)가위   2)바위    3)보 :");
		int user = sc.nextInt();
		System.out.println("computer: " + comp);

		switch (user - comp) {
		case 0:
			System.out.println("비겼습니다.");
		case 2: case -1:
			System.out.println("졌습니다.");
			break;
		case 1: case -2:
			System.out.println("이겼습니다.");			
			break;
		default:
			break;
		}

	}

}
