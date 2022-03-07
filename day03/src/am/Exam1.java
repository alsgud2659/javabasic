package am;

public class Exam1 {

	public static void main(String[] args) {
		/*
		  제어문 - 반복문 - while
		   
		 중괄호 안의 실행 구문을 반복적으로 실행하는 반복 제어문으로 조건을 만족하는동안
		 반복은 지속된다. 
		   while (조건) {
		   		실행구문;
		   }
		   
		   while 문과 for 문은 언제든지 상호 변환할수 있다. 
		   
		 */
//				int num = 0, sum = 0;
//				while(sum < 100) {
//					sum += num;
//					num++;
//				}
//				System.out.println((num-1) + "까지의 합 = " + sum);
//				
//				int a = 0;
//				while(a < 10) {
//					System.out.println(a + " ");
//					a++;
//				}
//				System.out.println();
				
//				for(int i = 0 ; i < 10 ; i++) {
//					System.out.println(i);
//				}
				
//				int c = 0;
//				while(true) {
//					if (c > 9) {
//						break;
//					}
//					System.out.println(c);
//					c++;
//				}
				
		/*
		 do~while
		 while문과 매우 비슷한 반복 제어문 , 
		 차이점은 조건식의 검사와 반복 실행의 순서에서 차이가 난다.
		 while과 do~while 의 가장 큰 차이점은 
		 while 실행구문이 단 한번도 실행이 되지 않을 수도 있다는 점에 비해
		 do~while은 실행구문이 반드시 한번은 실해이 되어야만 한다는 점이다. 
		 
		 do {
		 	실행 구문
		 	증감식
		 }while(조건식);//조건식이 아래에 위치하기 때문에 최초1회는 무조건 실행
		 
		 */
				
//				int a;
//				//while
//				a = 0;
//				while(a < 0) {
//					System.out.println(a);  //0번 실행
//				}
//				// do~while
//				a = 0;
//				do {
//					System.out.println(a);
//					a++;
//				} while(a < 0);             //1회가 반드시 실행
				
				// 초기값이 a = 0이므로 처음부터 조건식 a <0 은 false이다. 
				//따라서 while문으로 진입할수 없으므로 단 한 번도 실행되지 않는다. 
				// 반면 do~while 문일때는 일단 한번은 실행한 후에 조건식을
				// 검사하기 때문에 1회는 반드시 실행된다. 
				// 마치 do~while문은 while문 보다 1회 더 실행된다고 생각할수도
				// 있지만 절대 아니다. 
				
//				int a;
//				// while
//				a = 0;
//				while(a < 10) {
//					System.out.print(a + " ");
//					a++;
//				}
//				System.out.println();
//				a = 0;
//				do {
//					System.out.print(a + " ");
//					a++;
//				}while(a < 10);
				
			// 1회 이상 반복될 때는 동일한 결과가 나타난다. 즉, while문이
			// 0번 반복할 때만 차이가 있고 1회 이상에서는 완전히 동일하다.
			// 절대로 do-while문이 한 번 더 실행 되는 것이 아니다. 
				
			// 제어문의 중복
			// 제어문은 다른 제어문을 포함할 수 있다. 
				
//			for (int i = 0 ;  i < 3 ; i++) {
//				for (int j = 0 ; j < 5 ; j++) {
//					System.out.println(i + " " + j);
//				}
//			}
				
			int i = 0;	
			while (i < 3) {
				int j = 0;
				while(j < 5) {
					System.out.println(i + " " + j);
					j++;
				}
				i++;
			}

	}

}
