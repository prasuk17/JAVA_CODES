package arraylist;
import java.util.*;

public class arraulist {
	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<Integer>();
		System.out.println(list1.size());
		list1.add(5);
		list1.add(6);
		list1.add(7);
		System.out.println(list1.size());
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+ " ");
		}
		
		list1.add(0, 4);
		System.out.println();
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+ " ");
		}
		list1.set(2, 90);
		System.out.println();
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+ " ");
		}
		list1.remove(2);
		System.out.println();
		for(int elem : list1) {
			System.out.print(elem + " ");
		}
		
	}

}
