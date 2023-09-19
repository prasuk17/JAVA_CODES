package assignment_lect11;

import java.util.Scanner;

public class check_permutation {
public static boolean isPermutation(String str1, String str2){
		int c=0;
		boolean b=false;
		if(str1.length()!=str2.length()) {
			b=false;
		}
		else {
			for(int i=0;i<str1.length();i++) {
				for(int j=0;j<str2.length();j++) {
					if(str1.charAt(i)==str2.charAt(j)) {
						c++;
						break;
					}
				}
			}
			if(c==str1.length()) {
				b=true;
			}
		}
		
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
	}

}
