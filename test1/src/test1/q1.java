package test1;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n;i>0;i--) {
			int start =n;
			for(int j=1;j<=n;j++) {
				
				if(j==i) {
					System.out.print("*");
					
				}
				else {
					System.out.print(start);
				}
				
				start--;
			}
			System.out.println();
			
		}
	}

}
