package assignment_lect7;

import java.util.Scanner;
import java.lang.Math;

public class binary_to_decimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=n;
		int m=0;
		int c=0;
		int f=0;
		int dec=0;
		while(n!=0) {
			c++;
			//m=n%10;
			n=n/10;
		}
		//System.out.println(c);
		for(int i=0;i<c;i++) {
			//while(a!=0) {
				f=a%10;
				a=a/10;
				dec=(int) (dec+(f * Math.pow(2, i)));
				//System.out.println(dec);
				
				
			}
		
		System.out.println(dec);
		
	}

}
