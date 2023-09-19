package lect_11;

import java.util.Scanner;

public class str_pallindrome {
	public static boolean pal(String str) {
//		String revstr="";
//		for(int i=0;i<str.length();i++) {
//			revstr+= str.charAt(str.length()-1-i);
//		}
//		boolean p;
//		if(str.compareTo(revstr)==0) {
//			p=true;
//		}
//		else {
//			p=false;
//		}
//		return p;
		int i=0,j=str.length()-1;
		boolean p=true;
		while(i!=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				p=false;
			}
			else {
				i++;
				j--;
			}
			
		}
		return p;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		pal(str);
	}

}
