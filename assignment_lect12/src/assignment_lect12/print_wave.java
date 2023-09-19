package assignment_lect12;

import java.util.Scanner;

public class print_wave {
	public static void wavePrint(int mat[][]){
		//Your code goes here
        int r=mat.length;
        int c=r-1;
        int j=0;
        while(j<r){
            for(int i=0;i<r;i++){
            	System.out.print(mat[i][j]+" ");

       	 }
            j++;
            if(j<r){
                 for(int i=c;i>=0;i--){
            System.out.print(mat[i][j]+" ");
        }
           j++;
            }
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
		
		wavePrint(arr);
	}


}
