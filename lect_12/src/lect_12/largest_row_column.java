package lect_12;

import java.util.Scanner;

public class largest_row_column {
	public static void findLargest(int mat[][]){
		//Your code goes here
		int r=mat.length;
		int c= mat[0].length;
		int greaterrowsum=0;
		int greatercsum=0;
		int a=0,b=0;
		int j=0;
	    int i=0;
		for( i=0;i<r;i++) {
			int rowsum=0;
			for( j=0;j<c;j++) {
				rowsum=rowsum+mat[i][j];
			}
			if(rowsum>greaterrowsum) {
				greaterrowsum=rowsum;
				a=i;
				b=j;
				
			  
			}
		}
		
		for( j=0;j<c;j++) {
			int colsum=0;
			for(i=0;i<r;i++) {
				colsum=colsum+mat[i][j];
			}
			if(colsum>greatercsum) {
				greatercsum=colsum;
			    a=i;
			    b=j;
			}
		}
		if(greaterrowsum==greatercsum){
            System.out.println("row "+b+" "+greaterrowsum);

        }
		else if(greaterrowsum>greatercsum) {
			System.out.println("row "+a+" "+greaterrowsum);
		}
		else {
			System.out.println("column "+b+" "+greatercsum);
		}
//		System.out.println(greaterrowsum);
//		System.out.println(greatercsum);
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
		print(arr);
		findLargest(arr);
	}

}
