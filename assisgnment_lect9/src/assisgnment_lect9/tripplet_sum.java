package assisgnment_lect9;

import java.util.Scanner;

public class tripplet_sum {
	public static int findTriplet(int arr[], int x) {
		int size = arr.length;
		int count=0;
		for(int i=0;i<size-2;i++) {
			for(int j=i+1;j<size-1;j++) {
				for(int k=j+1;k<size;k++) {
					if((arr[i]+arr[j]+arr[k])==x) {
						count++;
						
					}
				}
				
			}
		}
	
		return count;
		
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
			int x =sc.nextInt();
			System.out.println(findTriplet(arr,x));
			t--;
	}

}


}
