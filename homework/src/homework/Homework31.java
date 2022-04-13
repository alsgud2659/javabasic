package homework;

import java.util.*;

public class Homework31 {
	Queue<Integer> queue;

	public Homework31(List<Integer> v1, List<Integer> v2) {
		queue = new LinkedList<Integer>();
		int i = 0;
		for (i = 0; i < Math.min(v1.size(), v2.size()); i++) {
			queue.add(v1.get(i));
			queue.add(v2.get(i));
		}
		if (v1.size() == v2.size()) {
			return;
		} else if (i == v1.size()) {
			queue.addAll(v2.subList(v1.size(), v2.size()));
			return;
		} else {
			queue.addAll(v1.subList(v2.size(), v1.size()));
			return;
		}
	}

	public int next() {
		return queue.remove();
	}

	public boolean hasNext() {
		if (queue.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		List<Integer> v1 = new ArrayList<Integer>();
		List<Integer> v2 = new ArrayList<Integer>();
		v1.add(1);
		v1.add(2);
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);
		Homework31 i = new Homework31(v1, v2);
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		return;
	}
}
