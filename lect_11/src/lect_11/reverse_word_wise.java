package lect_11;

import java.util.Scanner;

public class reverse_word_wise {
public static String reverseWordWise(String input) {
	    int i=0;
		String rev="";
		int currentwordstart=0;
		for(;i<input.length();i++) {
			
            if(input.charAt(i)==' ') {
            	int currentwordend=i-1;  
            	String word=" ";
            	for(int j=currentwordstart;j<=currentwordend;j++) {
            		word=word+input.charAt(j);
            	}
            	rev=word+rev;
				currentwordstart=i+1;
				
			}
			
		}
		int currentwordend=i-1;  
    	String word="";
    	for(int j=currentwordstart;j<=currentwordend;j++) {
    		word=word+input.charAt(j);
    	}
    	rev=word+rev;
		currentwordstart=i+1;
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
	}

}
