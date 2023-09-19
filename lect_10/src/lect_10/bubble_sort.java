package lect_10;

import java.util.Scanner;

public class bubble_sort {
	public static void bubbleSort(int[] arr){
    	//Your code goes here
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=0;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//			System.out.println(" ");
//		}
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
			bubbleSort(arr);
			
			t--;
	}
}

}
