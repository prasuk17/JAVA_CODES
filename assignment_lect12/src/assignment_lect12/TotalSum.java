package assignment_lect12;

import java.util.Scanner;

public class TotalSum {
	public static void totalSum(int[][] mat) {
		//Your code goes here
		int sum=0;
        int r=mat.length;
        int c =r-1;
        for(int i=0;i<r;i++) {
        	for(int j=0;j<r;j++) {
        		if(i==j) {
        			sum=sum+mat[i][j];
        		}
        		else if(i==0 && j!=0 && j!=c) {
        			sum=sum+mat[i][j];
        		}
        		else if(i==c && j!=0 && j!=c ) {
        			sum=sum+mat[i][j];
        		}
        		else if(j==0 && i!=0 && i!=c) {
        			sum=sum+mat[i][j];
        		}
        		else if(j==c && i!=0 && i!=c ) {
        			sum=sum+mat[i][j];
        		}
        	}

        	
        }
            //System.out.println(sum);
        
        for(int i=0; i<r;i++) {
        	for(int j=0;j<r;j++) {
        		if((i+j)==c && i!=j) {
        			sum=sum+mat[i][j];

        		}
        		
        	}
        }
        System.out.println(sum);
        
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
		totalSum(arr);
	}

}
