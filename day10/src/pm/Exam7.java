package pm;

public class Exam7 {

	public static void main(String[] args) {
		/*
		 예외 처리 문법은 크게 3가지 요소로 구성된다. 
		 try {
		 	//일반 예외, 실행 예외 발생 가능 코드 
		 }catch (예외명){
		    // 예외가 발생했을 때 처리
		 }finally{
		    // 예외 발생 여부와는 관계없이 항상 언제나 실행
		 }
		 
		 try{
		 	System.out.println(3/0);
		 	System.out.println("프로그램 종료");
		 } catch (ArithmeticException e) {
		 	System.out.println("숫자는 0으로 나눌수 없습니다.");
		 	System.out.println("프로그램 종료");
		 }
		 
		 
		  try{
		 	System.out.println(3/0);
		 } catch (ArithmeticException e) {
		 	System.out.println("숫자는 0으로 나눌수 없습니다.");
		 } finally {
		  	System.out.println("프로그램 종료");
		}
		 
		 
		 
		 */
//				 try{
//					 	System.out.println(3/0);
//					 	System.out.println("프로그램 종료");
//					 } catch (ArithmeticException e) {
//					 	System.out.println("숫자는 0으로 나눌수 없습니다.");
//					 	System.out.println("프로그램 종료");
//					 }
//				 
//				 
//				  try{
//					 	System.out.println(3/0);
//					 } catch (ArithmeticException e) {
//					 	System.out.println("숫자는 0으로 나눌수 없습니다.");
//					 } finally {
//					  	System.out.println("프로그램 종료");
//					}
				  
				  
		  /*
		   예외 처리 과정
		   
		   실제 내부적으로 예외가 처리되는 과정을 자세히 알아보자. 
		   
		  try{
			 	System.out.println(3/0);   ---> 예외 발생   --->  자바  (예외 클래스로 객체생성)
			 	                                               |  ArithmeticException excep = new ArithmeticException();
			 } catch (ArithmeticException e) {  <--------------|
			 	System.out.println("숫자는 0으로 나눌수 없습니다.");
			 } finally {
			  	System.out.println("프로그램 종료");
			}
		   
		   최초 try 구문이 실행되어 만약 예외가 발생하지 않으면 catch는 실행 되지 않는다. 그리고 finally 블록 구문을 실행한다. 
		 그런데 try 구문이 실행되어 만약 예외가 발생하면 자바가 먼저 인지하여 예외 타입의 객체를 생성하여 catch의 매개 변수로 전달한다.
		 이것은 마치 자바가 catch()라는 이름의 매서드를 호출하는 것과 비슷하다. 만약 자바가 생성해서 넘겨준 객체 타입을 catch블록이 처리
		 할수 없을때 즉 해당 객체를 받을 catch() 블록 존재하지 않으면 예외처리가 되지 않는다.  
		 
		 절대 매서드는 아니다......하지만 매서드가 다양한 입력 매개변수 타입으로 오버로딩될 수 있는 것처럼
		 catch() 블록도 예외 타입에 따라 여러개를 포함할 수 있다. 
		 
		 
		 try {
		 	//일반 예외, 실행 예외 발생 가능 코드 
		 }catch (예외타입 1){
		    // 예외가 발생했을 때 처리
		 }catch (예외타입 2){
		    // 예외가 발생했을 때 처리
		 }finally{
		    // 예외 발생 여부와는 관계없이 항상 언제나 실행
		 }
		 
		 // try-catch 구문과 1개의 다중 catch 구문 비교
		 
		   */
				// 1. 단일 try-catch
				
//				try {
//					System.out.println(3/0);
//				} catch (ArithmeticException e) {
//					System.out.println("숫자는 0으로 나눌수 없다. ");
//				} finally {
//					System.out.println("프로그램 종료");
//				}
				
				
				//2. 다중 try- catch
				
//				try {
//					System.out.println(3/0);
//					int num = Integer.parseInt("10A");
//				} catch(ArithmeticException e) {
//					System.out.println("숫자는 0으로 나눌수 없습니다.");
//				} catch(NumberFormatException e) {
//					System.out.println("숫자로 바꿀수 없습니다. ");
//				} finally {
//					System.out.println("프로그램 종료");
//				}
				
//				다중 예외 처리 구문을 작성시 주의할 사항은 try()구문에서 예외가 발생하고 
//				여러개의 catch()구문이 있어도 실행되는 catch()구믄은 항상 위에서부터 확인한다는 것이다. 
//				이것은 또 마치 if-else if - else구문에서 조건식을 위에서부터 검사하는 것과 같다. 
				
				
				
				//1개의 catch() 블록으로 2개의 예외를 동시에 처리하도록 통합해보자. 둘 중 어떤 예외가 발생해도 모두
				//하나의 예외처리로 해결할 수 있다. 
				
			try {
				System.out.println(3/1);
				int num = Integer.parseInt("10A");
			} catch(ArithmeticException | NumberFormatException e) {
				System.out.println("예외가 발생했습니다.");
			} finally {
				System.out.println("프로그램 종료");
				
			}
			
			//finally 는 항상 실행되는 블록이다. 그런데 또 다른 기능은 리소스를 해제하는 것이다. 
			//리소스 해제는 더이상 사용하지 않는 자원을 반납하는 것을 의미한다. 
			
		

	}

	

}
