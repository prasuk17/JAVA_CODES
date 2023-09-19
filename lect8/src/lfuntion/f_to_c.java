package lfuntion;

import java.util.Scanner;

public class f_to_c {
	public static void printFahrenheitTable(int start, int end, int step) {
        int C=0;
        
        
	while(start>=0 && start<=1000 && end>=start && end<=1000 && step>=0 && step<=1000) {
		C=(int)((start-32)*(.55));
		int m=0;
		//System.out.println(C);
		int a=start;
		while(a!=0){
			m++;
			a=a/10;
		}
		
			if(m==1) {
				System.out.println(start+"   "+C);
				start=start+step;
			}
			else if(m==2) {
				System.out.println(start+"  "+C);
				start=start+step;
			}
			else {
				System.out.println(start+" "+C);
				start=start+step;
			}
			
		}
		
    }
			
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		printFahrenheitTable(start, end, step);

}}
