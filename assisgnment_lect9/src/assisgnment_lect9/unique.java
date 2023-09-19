package assisgnment_lect9;

import java.util.Scanner;

public class unique {
	public static int unique(int arr[]) {
		 int count=0;
	        int size = arr.length;
	        int i=0;
	        int j=0;
	        int m=0;
	        if(size==1) {
	        	return arr[0];
	        }
	        else {
		        for(i=0;i<size-1;i++){
		        	count=0;
		            for(j=0;j<size;j++){
		            	if(i==j) {
		            		continue;
		            	}
		            	else {
		                if(arr[i]==arr[j]){
		                	//System.out.println(arr[i]+" "+arr[j]);
		                    count++;
		                }
		            }
		            }
		            
		            if(count==0){
		                m=arr[i];
		                break;
		            }
		           
		           
		        }
		        
		      return m;
		}
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
			int value = unique(arr);
			//int sum = sum(arr);
			System.out.println(value);
			t--;
	}

}


}
