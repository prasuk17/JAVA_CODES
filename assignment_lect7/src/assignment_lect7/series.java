package assignment_lect7;

import java.util.Scanner;

public class series {
	 Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int [] arr = new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
     }
     int j=0;
     boolean isDec=true,ans=true;
     while(j<n-1)
     {
      	
         if(arr[j]==arr[j+1])
         {
            ans=false;
             break;
             
         }
         else if(arr[j]<arr[j+1])
         {
             isDec=false;
             ans=true;
             
         }
         else {
             if(isDec==false)
             {
                ans=false;
                 break;
                 
             }
              ans=true;
         }
         j++;
     }
     if(ans==true)
     {
         System.out.print("true");
     }
     else{
          System.out.print("false");
     }


}
}
