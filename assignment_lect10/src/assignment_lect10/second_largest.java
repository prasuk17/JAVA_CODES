package assignment_lect10;

import java.util.Scanner;

public class second_largest {
	public static int secondLargestElement(int[] arr) {
    	//Your code goes here
		int c=0;
		if(arr.length==1) {
			return Integer.MIN_VALUE;
		}
		else {
			for(int i=1;i<arr.length;i++) {
				if(arr[0]!=arr[i]) {
					c++;
					break;
				}
				
			}
			if(c==0) {
				return Integer.MIN_VALUE;
			}
			else {
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
				return arr[arr.length-2];
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
		//int arr[]= inputarr();
		while(t>0) {
			
			int arr[]= inputarr();
			//int x= sc.nextInt();
			secondLargestElement(arr);
			System.out.println(secondLargestElement(arr));
			
			t--;
	}
}

}
