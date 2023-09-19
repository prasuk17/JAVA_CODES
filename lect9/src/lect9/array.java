package lect9;

import java.util.Scanner;

public class array {
	public static int largestnum(int arr[]) {
		int size= arr.length;
		System.out.println();
		int max= Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}
	public static int[] inputarr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		System.out.println("enter elements");
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		return arr;
	}
	public static void print(int arr[]) {
		int size = arr.length;
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]);
		}
		//System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= inputarr();
		print(arr);
		System.out.println(largestnum(arr));
		
		
	}
		

}
