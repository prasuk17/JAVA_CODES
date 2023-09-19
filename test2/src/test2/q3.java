package test2;

import java.util.Scanner;

public class q3 {
	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		for(int i=0;i<input.length-1;i++) {
			if(input[i]>input[i+1]) {
				System.out.print(input[i]+" ");
			}
		}
		System.out.println(input[input.length-1]);
	}
	public static int[] inputarr() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		return arr;
	
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//int arr[]= inputarr();
		while(t>0) {
			
			int arr[]= inputarr();
			//int x= sc.nextInt();
			
			leaders(arr);
			t--;
	}
}

}
