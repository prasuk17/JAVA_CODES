package assignment_lect10;

import java.util.Scanner;

public class rotate {
	public static void rotate(int[] arr, int d) {
    	//Your code goes here
       int arr1[] = new int[d];
       for(int i=0;i<d;i++) {
    	   arr1[i]=arr[i];
       }
       for(int i=0;i<arr.length-d;i++) {
    	   arr[i]=arr[i+d];
       }
       for(int i=0;i<d;i++) {
    	   arr[arr.length-d]=arr1[i];
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
