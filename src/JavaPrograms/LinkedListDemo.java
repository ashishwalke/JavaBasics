package JavaPrograms;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList();
		list.add(5);
		list.add(9);
		list.add(3);
		list.add(7);

		System.out.println("Integer Linked List Elements:" + list);
		System.out.println(list.indexOf(9));
		// System.out.println(list.remove(2));
		System.out.println(list.contains(5));
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.set(0, 6));
		System.out.println(list);
		// System.out.println(clear());

		List<Integer> list1 = new LinkedList();
		list1.add(12);
		list1.add(14);
		list1.add(16);
		list1.add(18);

		System.out.println(list1);

		System.out.println(list.addAll(list1));
		System.out.println(list);
		// System.out.println(list1.addAll(list));
		// System.out.println(list1);
		System.out.println(list.toArray());
		System.out.println(list1.removeAll(list1));
		System.out.println(list1);
		System.out.println(list);
		

	}

}
