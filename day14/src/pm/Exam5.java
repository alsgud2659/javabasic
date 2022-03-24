package pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exam5 {
/*
	객체 생성 방법
	Arrays.asList()메서드를 사용한 정적 컬렉션 객체 생성은 내부적으로는
	배열을 먼저 생성하고 이것을 List<E>로 래핑 wrapping 즉 포장만 해놓는다.
	따라서 내부구조는 배열과 동일하므로 컬렉션객체인데도 크기 변경이 불가능하다.
	구현 클래스로 객체를 생성했을 때와 달리 데이터의 추가 및 삭제가 불가능해진다.
	단 크기를 변경하지 않는 데이터의 변경은 가능하다.
	따라서 고정된 개수의 데이터를 저장하거나 활용할 때 사용된다.	 
	 
*/	
	
	public static void main(String[] args) {
		// Arrays.asList()메서드를 사용한 정적 컬렉션 객체 생성
		//List<Integer> aList1 = Arrays.asList(1,2,3,4);
		//aList1.set(1,7); // 1 7 3 4
		// aList1.add(5); // java.lang.UnsupportedOperationException예외발생
		//aList1.remove(0); // java.lang.UnsupportedOperationException예외발생
		
//		List<Integer> aList1 = new ArrayList<>();
//		List<Integer> aList2 = new ArrayList<>(30);
//		List<Integer> aList3 = new Vector<>();
//		List<Integer> aList4 = new Vector<>(30);
//		List<Integer> aList5 = new LinkedList<>();
		// List<Integer> aList6 = new LinkedList<>(30); 저장용량 지정불가
		
		// ArrayList<E> 클래스의 주요 메서드 활용 방법
		List<Integer> aList1 = new ArrayList<>();
		// 1. add - 끝에 계속 추가
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		
		// 2. add - 위치 지정 삽입
		aList1.add(1,6); // (index, value)
		System.out.println(aList1.toString());
		
		// 3. addAll - 또 다른 리스트를 통째로 넣기
		List<Integer> aList = new ArrayList<>();
		aList.add(1);
		aList.add(2);
		aList.addAll(aList1);
		System.out.println(aList.toString());
		
		// 4. addAll - 또 다른 리스트를 위치를 지정하여 통째로 넣기
		List<Integer> aList0 = new ArrayList<>();
		aList0.add(1);
		aList0.add(2);
		aList0.addAll(1, aList);
		System.out.println(aList0.toString());
		
		// 5. set
		aList0.set(1, 5);
		System.out.println(aList0.toString());
		
		// 6. remove
		aList0.remove(1); // index값을 삭제
		System.out.println(aList0.toString());
		
		// 7. remove - 값을 삭제
		aList0.remove(new Integer(2)); // 처음 등장하는 값을 삭제
		System.out.println(aList0.toString());
		
		// 8.clear()
		aList0.clear();
		System.out.println(aList0.toString());
		
		// 9. isEmpty()
		System.out.println(aList0.isEmpty());
		
		// 10. size()
		System.out.println(aList0.size());
		
		// 11. get() - 인덱스로 가져오기
		System.out.println(aList.get(0));
		System.out.println(aList.get(1));
		System.out.println(aList.get(2));
		
		
		for (int i = 1; i < aList.size() + 1; i++) {
			System.out.println(i + "번째 값:" + aList.get(i-1));
		}
	}

}


















