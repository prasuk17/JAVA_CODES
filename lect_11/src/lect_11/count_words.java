package lect_11;

import java.util.Scanner;

public class count_words {
	public static int countwords(String str) {
		int count=0;
		if(str.length()==0) {
			return count;
		}
		else {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==' '|| str.charAt(i)=='\n'|| str.charAt(i)=='\t') {
					count++;
				}
			}
			return count+1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(countwords(str));
	}


}
