package lect_10;

import java.util.Scanner;

public class binary_search {
	public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
		int start = 0;
		int end= arr.length-1;
		int mid=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(x==arr[mid]) {
				return mid;
			}
			else if(x>arr[mid]) {
				start=mid+1;
				
			}
			
			else {
				end=mid-1;
			}
		}
		return -1;
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
		int arr[]= inputarr();
		while(t>0) {
			
			//int arr[]= inputarr();
			int x= sc.nextInt();
			System.out.println(binarySearch(arr,x)); 
			
			
			t--;
	}
}
}
