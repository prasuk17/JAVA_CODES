package assisgnment_lect9;

import java.util.Scanner;

public class intersection {
	public static void intersections(int arr1[], int arr2[]) {
		int i=0;
		int j=0;
		int size1= arr1.length;
		int size2= arr2.length;
		int start=0;
		for(i=0;i<size1;i++) {
			for(j=0;j<size2;j++) {
				if(j==start) {
					continue;
				}
				else {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					start=j;
					break;
				}
				//break;
				
			}
			}
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
		while(t>0) {
			int arr1[]= inputarr();
			//int value = duplicate(arr1);
			//int sum = sum(arr);
			int arr2[]= inputarr();
			//int value = duplicate(arr2);
			intersections(arr1,arr2);
		
			t--;
	}

}


}
