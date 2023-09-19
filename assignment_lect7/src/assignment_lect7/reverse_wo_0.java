package assignment_lect7;

import java.util.Scanner;

public class reverse_wo_0 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a=n;
		int rev=0;
		int m;
		boolean b=true;
		while(n!=0) {
			m=n%10;
			n=n/10;
			if(b) {
				if(m==0) {
					continue;
					
				}
				else {
					b=false;
				}
			}
			rev=rev*10+m;
			
		}
		System.out.println(rev);
	}

}
