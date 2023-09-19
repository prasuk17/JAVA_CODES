package lect7;

import java.util.Scanner;

public class nth_fib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int c=1;
		int a=0;
		int b=1;
		int d=0;
		if(n==1) {
			System.out.println(a);
		}
		else if(n==2) {
			System.out.println(b);
		}
		else {
			
			for(int i=3;i<=n;i++) {
				d=a+b;
				a=b;
				b=d;
			}
		
		System.out.println(d);
		}
		
	

}
}
