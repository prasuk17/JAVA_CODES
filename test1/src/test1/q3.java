package test1;

import java.util.Scanner;
import java.lang.Math;

public class q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a=n;
		int b=n;
		int c=0;
		int m=0;
		int arm = 0;
		while(n!=0) {
			c++;
			n=n/10;
			//System.out.println(c);
		}
		while(a!=0) {
			m=a%10;
			arm=(int) (arm+Math.pow(m, c));
			a=a/10;
			
	}
		if(b==arm) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

}
}
