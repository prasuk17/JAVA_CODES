package test2;

import java.util.Scanner;

public class q2 {
public static String minLengthWord(String input){
		
		// Write your code here
	//String word= "";
	int wordstart=0;
    String smallest="";
    if(input.length()==0) {
    	
    }
	for(int i=0;i<input.length();i++) {
		if(input.charAt(i)==' ') {
			int wordend=i-1;
			String word= "";
			for(int j=wordstart;j<=wordend;j++) {
				word = word+input.charAt(j);
			}
			wordstart=i+1;
			if(word.length()< smallest.length() || smallest.length()==0) {
				smallest=word;
			}
		}
	}
    return smallest;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(minLengthWord(str));
		//minLengthWord(str);
	}

}
