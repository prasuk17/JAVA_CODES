package test2;

import java.util.Scanner;

public class q1 {
	public static void print2DArray(int input[][]) {
		// Write your code here 
        int n=input.length;
          for(int i=0;i<input.length;i++){
        	  for(int k=n;k>0;k--){
              for(int j=0;j<input[i].length;j++){
                  
                      System.out.print(input[i][j]+" ");
                      

                  }
              System.out.println();
              }
              //System.out.println();
              n--;
          }
      
	}
	public static int[][] input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int r =sc.nextInt();
		System.out.println("enter no of colums");
		int c = sc.nextInt();
		int arr[][]= new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void print(int arr[][]){
		int r = arr.length;
		int c= arr[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" " );
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[][]= input();
		//print(arr);
		//findLargest(arr);
		print2DArray(arr);
	}


}
