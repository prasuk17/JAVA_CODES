package While_loop;

import java.util.Scanner;

public class F_to_C {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int S = sc.nextInt();
	int E = sc.nextInt();
	int W = sc.nextInt();
	int C;
	while(S>=0 && S<=90 && E>=S && E<=900 && W>=0 && W<=80) {
		C=(int)((S-32)*(.55));
		//System.out.println(C);
		System.out.println(S+" "+C);
		S=S+W;
		
		
	}
	
}
}
