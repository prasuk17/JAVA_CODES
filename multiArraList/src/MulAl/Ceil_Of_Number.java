package MulAl;

import java.util.Scanner;

public class Ceil_Of_Number {
	public static int  binarysearch(int arr[],int n) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int mid=s+ (e-s)/2;
			if(arr[mid]==n) {
				return arr[mid];
			}
			else if(arr[mid]>n) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return arr[e];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,6,7,8};
		int n=sc.nextInt();
		System.out.println(binarysearch(arr,n));
	}

}
