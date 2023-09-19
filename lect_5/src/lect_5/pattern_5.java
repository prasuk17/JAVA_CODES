package lect_5;
import java.util.*;
public class pattern_5 {
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
			int n= sc.nextInt();
	        char ch = (char)('A'+n-1);
			for(int i=1;i<=n;i++) {
	            char start=(char)(ch-i+1);
				for(int j=1;j<=i;j++) {
					System.out.print(start);
	                start=(char)(start+1);
				}
				System.out.println();
			}
	}

}
