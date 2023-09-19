package assignment_lect12;

import java.util.Scanner;

public class spiral {
	public static void spiralPrint(int matrix[][]){
		//Your code goes here
		
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
		spiralPrint(arr);
	}


}
