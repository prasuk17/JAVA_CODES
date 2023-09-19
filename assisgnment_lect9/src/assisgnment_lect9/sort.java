package assisgnment_lect9;

import java.util.Scanner;

public class sort {
	public static void sortZeroesAndOne(int[] arr) {
		int size= arr.length;
		int count=0;
		for(int i=0;i<size;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		for(int i=count;i<size;i++) {
			arr[i]=1;
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
			
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
			int arr[]= inputarr();
			//int sum = sum(arr);
			sortZeroesAndOne(arr);
			t--;
	}

}


}
