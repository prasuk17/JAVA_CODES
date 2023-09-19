package lect_6;

import java.util.Scanner;

public class sum_pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=0;
			for(int j=1;j<=i;j++) {
				
				sum=sum+j;
				System.out.print(j);
				if(j<i) {
					System.out.print("+");
				
				}
				
			}
			//System.out.print("+");
			System.out.println("="+sum);
			
		}
		
	}

}
