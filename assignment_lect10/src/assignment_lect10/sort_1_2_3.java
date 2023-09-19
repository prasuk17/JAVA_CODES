package assignment_lect10;

import java.util.Scanner;

public class sort_1_2_3 {
	public static void sort012(int[] arr){
    	//Your code goes here
		int c0=0,c1=0,c2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				c0++;
			}
			else if(arr[i]==1) {
				c1++;
			}
			else {
				c2++;
			}
		}int i=0;
		while(c0!=0){
			arr[i]=0;
			c0--;
			i++;
			
		}
		while(c1!=0){
			arr[i]=1;
			c1--;
			i++;
			
		}
		while(c2!=0){
			arr[i]=2;
			c2--;
			i++;
			
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
//			secondLargestElement(arr);
//			System.out.println(secondLargestElement(arr));
			
			t--;
	}
}

}
