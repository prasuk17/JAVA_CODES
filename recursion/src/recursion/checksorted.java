package recursion;

import java.util.Scanner;

public class checksorted {
	public static boolean checkifsorted(int arr[]) {
		if(arr.length<=1) {
			return true;
			
		}
		int smallinput[]= new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallinput[i-1]=arr[i];
		}
		boolean smallans = checkifsorted(smallinput);
		if(!smallans) {
			return false;
		}
		if(arr[0]<=arr[1]) {
			return true;
		}
		else {
			return false;
			
		}
	}
	public static void main(String[] args) {
		System.out.println("enter size of array");
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(checkifsorted(arr));
	}

}
