package lfuntion;

import java.util.Scanner;

public class ncr {
	public static int fact(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac=fac*i;
		}
		return fac;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int num = fact(n);
		int den1= fact(r);
		int den2= fact(n-r);
		int ncr=num/(den1*den2);
		System.out.println(ncr);
		
	}

}
