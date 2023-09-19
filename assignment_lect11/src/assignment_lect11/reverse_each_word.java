package assignment_lect11;

import java.util.Scanner;

public class reverse_each_word {
	public static String reverseeachword(String str) {
	    int i=0;
		String ans="";
		int currentwordstart=0;
		for(;i<str.length();i++) {
			
            if(str.charAt(i)==' ') {
            	int currentwordend=i-1;  
            	String rev=" ";
            	for(int j=currentwordstart;j<=currentwordend;j++) {
            		rev=str.charAt(j)+rev;
            	}
            	ans=ans+rev;
				currentwordstart=i+1;
				
			}
			
		}
		int currentwordend=i-1;  
    	String rev=" ";
    	for(int j=currentwordstart;j<=currentwordend;j++) {
    		rev=str.charAt(j)+rev;
    	}
    	ans=ans+rev;
		currentwordstart=i+1;
		
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
	}


}
