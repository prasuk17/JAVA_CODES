package lfuntion;

import java.util.Scanner;

public class fib_num_check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long a=0;
		long b=1;
		long c=0;
		int count=0;
		if(n==0) {
			System.out.println("true");
		}
		else if(n==1) {
			System.out.println("true");
		}
		else {
			for(int i=3;i<=1000;i++) {
				c=a+b;
				a=b;
				b=c;
				//System.out.println(c);
				if(n==c) {
					count++;
					
				}
				
			}
		}
		if(count==0) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
	}

}
