package assignment_lect7;

import java.util.Scanner;

public class sum_or_product {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N =sc.nextInt();
		int C = sc.nextInt();
		int sum=0;
		int prod=1;
		if(C==1) {
			for(int i=1;i<=N;i++) {
				sum= sum+i;
				
			}
			System.out.println(sum);
		}
		else if(C==2) {
			for(int i=1;i<=N;i++) {
				prod=prod*i;
			}
			
		System.out.println(prod);
		}
		else {
			System.out.println(-1);
		}
	}

}
