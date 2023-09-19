package lect_11;

import java.util.Scanner;

public class rev {
	public static void rev(String str) {
		String revstr="";
		for(int i=0;i<str.length();i++) {
			//revstr+= str.charAt(str.length()-1-i);ye bhi shi tha		
			revstr=str.charAt(i)+revstr;
		}
		System.out.println(revstr);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		rev(str);
	}

}
