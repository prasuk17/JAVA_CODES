package recursion;

import java.util.Scanner;

public class array_sum {
	public static int sum(int input[]) {
		if(input.length==1){
            return input[0];
        }
		int smallinput[]= new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallinput[i-1]=input[i];
		}
		int add=0;
		 add= input[0]+sum(smallinput);
		 
		 return add;
	}

	public static void main(String[] args) {
		System.out.println("enter size of array");
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(sum(arr));
	}
}
