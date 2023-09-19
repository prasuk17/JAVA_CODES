package assignment_lect11;

import java.util.Scanner;

public class remove_consecutive_duplicates {
public static String removeConsecutiveDuplicates(String str) {
	String ans="";
	for(int i=0;i<str.length()-1;i++) {
		if(str.charAt(i)!=str.charAt(i+1)) {
			ans=ans+str.charAt(i);
		}
	}
	return ans;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
	}

}
