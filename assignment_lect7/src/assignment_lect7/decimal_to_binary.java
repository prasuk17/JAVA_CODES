package assignment_lect7;

import java.util.Scanner;

public class decimal_to_binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		long bi=0;
		int a=n;
		int b=n;
		int m=0;
		int c=0;
		boolean t=true;
	    while(a!=0) {
	        m= a%2;
	        if(t) {
	        	if(m==0) {
	        		c++;
	        	}
	        	else {
	        		t=false;
	        	}
	        }
	       // System.out.print(c+"\t");
	    	a=a/2;
	    	bi=bi*10+m;
	    	//System.out.println(bi);
			
		}
	    long h=0;
	    long bi1=0;
	    while(bi!=0) {
	    	h=bi%10;
	    	bi=bi/10;
	    	bi1=(bi1*10)+h;
	    	
	    	
	    }
	    //System.out.println(bi1);
	    long p=1;
	    if(c!=0) {
	    	for(int i=1;i<=c;i++) {
	    		p=p*10;
	    	}
	    	System.out.println(bi1*p);
	    	
	    }
	    else {
	    	System.out.println(bi1);
	    }
	}

}

