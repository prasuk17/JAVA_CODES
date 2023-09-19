package lect_10;

import java.util.Scanner;

public class insertion_sort {
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j= i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
    	//Your code goes here
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
			
			
			t--;
	}
}
	

}
