package lect_11;

import java.util.Scanner;

public class print_all_chat {
	public static void allChar(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		allChar(str);
	}

}
