package assignment_lect7;

import java.util.Scanner;

public class ap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a;
		int i=1;
		int c=0;
		while(i<=(n+c)) {
			a=(3*i)+2;
			i++;
			if(a%4==0) {
				c++;
				continue;
			}
			System.out.println(a);
			//i++;
		}
	}

}

