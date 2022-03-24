package pm;

import java.util.HashSet;

public class Exam8 {

	public static void main(String[] args) {
		// Set 컬렉션
		// 동일한 타입의 묶음이라는 특징은 그대로 갖고있지만 인덱스 정보를 포함하지 않는 집합의 개념과 같은 컬렉션이다.
		// 인덱스가 없으므로 데이터를 중복으로 저장하면 중복된 데이터중 특정 데이터를 꺼낼 방법이 없다.
		// 즉 set은 동일한 데이터의 중복을 허용하지 않는다.
		
		// HashSet 구현 클래스
		HashSet hset1 = new HashSet();
		
		hset1.add("가");
		hset1.add("나");
		hset1.add("다");
		
		System.out.println(hset1);
		
		HashSet hset2 = new HashSet();
		hset2.add("나");
		hset2.add("다");
		
		System.out.println(hset2);
		
		hset2.addAll(hset1);
		
		System.out.println(hset2);
		
		hset2.remove("나");
		
		System.out.println(hset2);
		
		hset2.clear();
		
		System.out.println(hset2);
		
		// HashSet은 데이터의 중복을 허용하지 않는다. 즉 같은 데이터를 2개 이상 포함 할 수 없다.
		// 여기서 생각해 볼 것은 '데이터가 같다' 또는 '데이터가 다르다'의 기준은 무엇일까
		// 예를들어 3과 3은 같은 데이터이다. 즉 2개 이상을 저장할 수 없다.
		// A a1 = new A(3); 과 A a2 = new A(3); 생성자의 동일한 값을 넘겨서 객체를 생성했으므로 두 객체는 완벽히 똑같다.
		// 하지만 set의 관점에서는 다른 객체이다. 즉 둘다 저장할 수 있다.
		// 같은 예로 String s1 = new String("hi") String s2 = new String("hi");
		
		
		// 해시코드의 개념 - 객체의 해시코드는 객체가 저장된 주소와 관련된 값으로 실제 번지값은 아니다.
		//             객체가 저장된 번지를 기준으로 생성된 정수형 고유값이 바로 해시코드이다.
		
		A a = new A(3);
		A b = new A(3);
		System.out.println(a == b);		// 두 객체의 해시코드가 동일한지를 비교
		System.out.println(a.equals(b));// 두 객체를 비교
		
		String c = "하이";
		String d = new String("하이");
		System.out.println(c == d);
		System.out.println(c.equals(d));
		
	}

}

class A{
	int data;
	public A(int data) {
		this.data = data;
	}
}















