package assignment_lect11;

import java.util.Scanner;

public class compressthestring {
public static String getCompressedString(String str) {
		String ans="";
		int i=0;
		
		for(i=0;i<str.length();i++) {
			int count=0;
			while(str.charAt(i)==str.charAt(i+1)) {
					count++;
				}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
	}
}
