package recursion;

import java.util.Scanner;

public class first {
	public static int firstIndex(int input[], int x) {
		return firstIndex(input,x,0);
	}
	
     public static int firstIndex(int input[], int x, int si){
        if (si==input.length-1)
        {
            if (input[si]==x)
            {
                return si;
            }
            else
            {
                return -1;
            }
        }
        
        if (input[si]==x)
        {
            return si;
        }
        
        int smallIdx=firstIndex(input,x,si+1);
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
		System.out.println(firstIndex(arr, x));
	}

	

}
