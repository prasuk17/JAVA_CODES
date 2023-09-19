package MulAl;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<ArrayList<Integer>> lst = new ArrayList<ArrayList<Integer>>(10);
		for(int i=0;i<3;i++) {
			lst.add( new ArrayList<Integer>());
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				lst.get(i).add(sc.nextInt());
			}
		}
		System.out.println(lst);
	}

}
