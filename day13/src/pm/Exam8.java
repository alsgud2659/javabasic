package pm;

public class Exam8 {


/*
 제네릭 메서드
 클래스 전체를 제네릭으로 선언하는 대신에 일반 클래스의 내부의 특정 매서드만 제네릭으로
 선언할수있다. 이것을 제네릭 매서드라고 하고 리턴 타입 또는 매개변수 타입을 제네릭 타입
 변수로 선언한다. 
 
 제네릭 클래스가 객체를 생성하는 시점에  실제 타입을 지정하는 것과는 다르게
 제네릭 매서드는 호출되는 시점에 실제 제네릭 타입을 지정하게 된다. 
 
 
 */
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");  //생략 가능
		
		System.out.println(str1);
		System.out.println(str2);
		
		boolean bool1 = gm.<Double>method2(2.5, 2.5);
		boolean bool2 = gm.method2(2.5, 2.5);//생략 가능

		System.out.println(bool1);
		System.out.println(bool2);
		
		gm.<String, Integer>method3("국어", 80);
		gm.method3("국어", 80);
	}

}


class GenericMethods{
	public <T> T method1 (T t) {
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);
	}
	
	
	public <K, V> void method3 (K k, V v) {
		System.out.println(k + ":" + v);
	}
}

/*
제네릭 매서드의제네릭 타입 변수는 메서드가 호출되는 시점에 결정된다. 
즉 정의 하는 시점에는 아직 어떤 타입이 입력될지 전혀 모르는 것이다. 
*/
