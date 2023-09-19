package lect_6;

import java.util.Scanner;

public class half_diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println('*');
		for(int i=1;i<=n;i++) {
			System.out.print('*');
			
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				int start=i-1;
				for(int j=1;j<i;j++) {
					System.out.print(start);
					start--;
				}
//				System.out.println();
				System.out.println('*');
			
			
		}
		for(int i=1;i<n;i++) {
			System.out.print('*');
		    for(int j=1;j<=n-i;j++) {
		    	System.out.print(j);
		}
//		    int start=n-2;
		    for(int j=n-1-i;j>0;j--) {
		    	System.out.print(j);
		    	
		    }
		    
		    System.out.println('*');
		 
	}
		System.out.println('*');
		

}
}
