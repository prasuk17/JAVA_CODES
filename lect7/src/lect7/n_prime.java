package lect7;

import java.util.Scanner;

public class n_prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.println(2);
		for(int i=3;i<n;i++) {
			int c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c+=1;
				}
			}
			if(c==0) {
				System.out.println(i);
			}
			
		}
	}

}
