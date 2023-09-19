package assignment_lect10;

import java.util.Scanner;

public class rotate_check {
	 public static int arrayRotateCheck(int[] arr){
	        int count=0;
	        int l= arr.length;
	        if(l==1){
	         count =0;
	        }
	        else{
	            for(int i=0;i<l;i++){
	            if(arr[i]<arr[i+1]){
	                count++;
	            }
	            else{
	                break;
	            }
	            
	        }
	            count=count+1;
	      
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
			System.out.println(arrayRotateCheck(arr));
			t--;
	}

}

}
