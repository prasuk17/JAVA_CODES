package LInkedList;

import java.util.LinkedList;

public class collections_linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.addFirst(0);
		ll.addLast(20);
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		ll.set(1, 15);
		ll.add(1, 10);
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
	}

}
