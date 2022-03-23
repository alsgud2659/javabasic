package pm;

public class Exam7 {

	public static void main(String[] args) {
		// 제네릭 타입 변수가 2개일때를 생각해 보자 제네릭 타입 변수가 2개인 점만
//		제외하면 전시간에 살펴본 변수가 1개일때와 완벽하게 동일하다. 
//		객체를 생성할 때 사용한 실제 제네릭 타입은 순서대로 각각의 제네릭 타입 변수로 치환된다. 

		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("사과");
		kv1.setValue(1000);

		String key1 = kv1.getKey();
		int value1 = kv1.getValue();

		System.out.println(key1 + value1);

		KeyValue<Integer, String> kv2 = new KeyValue<>();
		// kv2.setKey("에러");
		kv2.setValue("Not Found(요청한 페이지를 찾을수 없다.");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();

		System.out.println(key2 + value2);

		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키값만 사용");
		String key3 = kv3.getKey();
		System.out.println(key3);

	}

}

class KeyValue<K, V> {

	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}

/*
 * 사과와 연필 저장 예로 돌아가보자 결국 우리가 원하는 것은 1. 추가 클래스 생성 없이 어떤 상품도 저장 관리 할 수 있어야 한다는 것
 * 2. setter메서드에 잘못된 객체를 입력했을 때 바로 문법으로 확인 할수 있어야 하고 3. getter메서드의 리턴 타입도 다운캐스팅이
 * 필요 없어야 한다는 것이다. 1의 경우에는 Object 타입으로 선언을 통해 가능해지지만 2/3 의 경우까지 만족 시키기 위한 유일한
 * 방법이 바로 제네릭이다.
 */