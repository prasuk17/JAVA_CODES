package assisgnment_lect9;

import java.util.Scanner;

public class duplicate {
	public static int duplicate(int arr[]) {
		int i=0;
		int j=0;
		int c=0;
		int m=0;
		int size= arr.length;
		for(i=0;i<size-1;i++) {
			for(j=0;j<size;j++) {
				if(i==j) {
					continue;
				}
				else {
					if(arr[i]==arr[j]) {
						m= arr[i];
						break;
					}
					else {
						continue;
					}
				}
			}
		}
		return m;
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
			int value = duplicate(arr);
			//int sum = sum(arr);
			System.out.println(duplicate(arr));
			t--;
	}

}


}
