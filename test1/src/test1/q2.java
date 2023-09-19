package test1;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(0);
				}
				
			}
			System.out.print("*");
			
//		}
//		for(int i=n;i>0;i--) {
			//int p=n;
			for(int j=1;j<=n;j++) {
				if(j==(n-i+1)){
					System.out.print("*");
				}
				else {
					System.out.print(0);
				}
				//p--;
			}
			System.out.println();
		}
		
	}

}
