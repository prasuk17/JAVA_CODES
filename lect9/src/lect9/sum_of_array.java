package lect9;

import java.util.Scanner;

public class sum_of_array {
	public static int sum(int arr[]) {
		int size= arr.length;
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		return sum;
		
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
		while(t>0) {
			int arr[]= inputarr();
			int sum = sum(arr);
			System.out.println(sum);
			t--;
	}

}
}

