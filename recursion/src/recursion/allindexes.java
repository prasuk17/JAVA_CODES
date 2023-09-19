package recursion;

import java.util.Scanner;

public class allindexes {
	static int i=0;
	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return allIndexes(input,x,0);
	}
    public static int[] allIndexes(int input[], int x,int si){
    	int arr[] =new int[input.length];
    	
        if(input.length-1 ==si) {
        	if(si==x) {
        		 arr[i]=si;
        		 i++;
        	}
        }
        if(input[si]==x) {
        	arr[i]=si;
        	i++;
        }
        int smallIdx= allIndexes(input,x,si+1);
        return smallIdx;
    }
	public static void main(String[] args) {
		int n;
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter no to be searched");
		int x= sc.nextInt();
		System.out.println(allIndexes(arr, x));
	}

}
