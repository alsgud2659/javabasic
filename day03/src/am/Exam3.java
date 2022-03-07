package am;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		while(true) {
			System.out.println("메뉴입력");
			System.out.println("1) 빅맥");
			System.out.println("2) 타코");
			System.out.println("3) 백반");
			System.out.println("0) 선택종료");			
			System.out.print("선택:");
			int menu = sc.nextInt();
			
			if (menu > 4) {
				System.out.println("번호를 잘못 입력하셨습니다.");
				continue;
			}
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (menu == 1) {
				System.out.println("선택하신 메뉴는 빅맥입니다.");
				continue;
			}
			if (menu == 2) {
				System.out.println("선택하신 메뉴는 타코입니다.");
				continue;
			}
			if (menu == 3) {
				System.out.println("선택하신 메뉴는 백반입니다.");
				continue;
			}
			
		}

	}

}
