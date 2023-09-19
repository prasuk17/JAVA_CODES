package lect_11;

import java.util.Scanner;

public class all_substring {
public static void printSubstrings(String str) {
	String substr="";
	for(int i=0;i<str.length();i++) {
		substr="";
		for(int j=i;j<str.length();j++) {
		 substr=substr+str.charAt(j);
		 System.out.println(substr);
		}
	}
		
	}

public static void printSubstrings1(String str) {
	String substr="";
	for(int len=0;len<str.length();len++) {
		for(int start=0;start<str.length()-len;start++) {
			int end=start+len;
			System.out.println(str.substring(start, end+1));
		}
	}
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printSubstrings1(str);
	}

}
