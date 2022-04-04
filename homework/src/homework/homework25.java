package homework;

import java.util.ArrayList;

public class homework25 {

	public static void main(String[] args) {
		// 161
		// List<Integer> list1 = new ArrayList<>();
		
		// 162
		// HashTable은 Thread-safe하고 HashMap은 Thread-safe하지 않다.
		// HashTable은 key에 null값을 허용하지 않지만, HashMap은 허용한다.
		
		// 163
		// hashmap은 순서를 보장하지 않지만 treemap은 레드블랙트리로 구현되어 순서를 보장하며 속도가 hashmap에 비해 느리다.
		
		// 164
		// Comparable은 객체의 정렬기준을 정해줄 때 사용하고 Comparator은 이미 정해진 정렬기준 외 다른 정렬기준을 사용하고 싶을때 사용한다.
		
		// 165
		//
		
		// 166
		// equals는 보통 String객체를 비교할때 사용하는데 ==으로 하게되면 그 객체의 주소값을 비교하지만 equals는
		// 그 객체 내부의 데이터를 비교한다.
		
		// 167
		// 해시테이블에서 데이터들을 저장할때 해시코드라는 알고리즘을 통해 데이터들이 저장될 주소를 정해준다.
		// 1,2,3,4,5,6,7이란 데이터 들을 해시 테이블에 저장할 때 hashcode를 data % 8로 정의하면 1은 7번 위치, 2는 6번위치 이런식으로 저장되기 때문에
		// 나중에 데이터를 검색할 때 선형구조로 저장되었다면 O(n)만큼의 시간이 걸리지만 해쉬코드를 사용하면 선형시간내에 원하는 값을 찾아 낼 수 있다.
		
		// 168
		// 비슷한 기능을 지원하는 코드의 경우 재사용성이 높아지고
		// 클래스 외부에서 타입을 지정해주기 떄문에 따로 타입을 체크하고 변환할 필요가 없어지며,
		// 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지하기 때문에 사용하면 좋다.
		
		// 169
		// Collections.emptyList()는 static으로 이미 만들어진 객체를 불러다 쓰는것이기 때문에 CPU와 메모리에 추가 비용이 발생하지 않지만
		// final로 선언되기 때문에 리스트를 리턴받아서 값을 추가 하거나 변경할 수 없다.
		
		// 170
		// clone()메서드 사용
		
		// #45
		int result = 0;
		String version1 = "1.0.1";
		String version2 = "1.0.0.1";
		
		String[] ver1 = version1.split("//.");
		String[] ver2 = version2.split("//.");
		
		int max = Math.max(ver1.length, ver2.length);
		
		for (int i = 0; i < max; i++) {
			int temp1 = 0;
			int temp2 = 0;
			if(i < ver1.length) {
				temp1 = Integer.parseInt(ver1[i]);
			}
			if(i < ver2.length) {
				temp2 = Integer.parseInt(ver2[i]);
			}
			
			if(temp1 > temp2) {
				result = 1;
			}else if(temp1 < temp2) {
				result = -1;
			}
			
		}
		
		System.out.println(result);
		
	}

}
