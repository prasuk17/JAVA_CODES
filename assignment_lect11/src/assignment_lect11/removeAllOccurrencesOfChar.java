package assignment_lect11;

import java.util.Scanner;

public class removeAllOccurrencesOfChar {
public static String removeAllOccurrencesOfChar(String str, char ch) {
	String ans="";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)!=ch) {
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
