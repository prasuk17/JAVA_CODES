package lect_6;

import java.util.Scanner;

public class isoceles_triangle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			int start =1;
			for(int j=1;j<=i;j++) {
				System.out.print(start);
				start++;
			}
			int start1=1;
			for(int j=1;j<=i-1;j++) {
				System.out.print(start1);
				start1++;
			}
			System.out.println();
		}
		
//		for(int i=1;i<=n;i++) {
//			int start=1;
//			for(int j=1;j<=i-1;j++) {
//				System.out.print(start);
//				start++;
//			}
			
			//System.out.println();
		}
	}


