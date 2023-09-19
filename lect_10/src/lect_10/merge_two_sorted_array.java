package lect_10;

import java.util.Scanner;

public class merge_two_sorted_array {
	public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
		int arr3[]= new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				k++;
				i++;
				
			}
			else {
				arr3[k]=arr2[j];
				k++;
				j++;
				}
		}
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		return arr3;
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
			
			int arr1[]= inputarr();
			int arr2[]= inputarr();
			//int x= sc.nextInt();
			
			
			t--;
	}
}

}
