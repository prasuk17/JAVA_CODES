package lect_6;
import java.util.*;
public class star_diamond {
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=(n+1)/2;i++) {
			for(int k=1;k<=((n+1)/2)-i;k++) {
				System.out.print(" ");
				//k=k+1;
			}
			//int start =1;
			for(int j=1;j<=i;j++) {
				System.out.print('*');
				//start++;
			}
			//int start1=1;
			for(int j=1;j<=i-1;j++) {
				System.out.print('*');
				//start1++;
			}
            //for()
			System.out.println();
		}
		//int k=0;
        for(int i=0;i<(n-1)/2;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(" ");
            }
            //k++;
            for(int j=1;j<=((n-1)/2)-i;j++){
               System.out.print('*');
               
            }
            for(int j=1;j<=((n-3)/2)-i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

	}

}
