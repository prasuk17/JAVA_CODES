package lect_10;

import java.util.Scanner;

public class selection_sort {
	public static void selectionSort(int[] arr) {
	    	//Your code goes here
		//int temp=0;
		for(int i=0;i<arr.length;i++) {
			int min=arr[i];
			int minindex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minindex=j;
				}
				
			}
			arr[minindex]=arr[i];
			arr[i]=min;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.println(" ");
		}
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
