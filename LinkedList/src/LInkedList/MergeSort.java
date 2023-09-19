package LInkedList;

import java.util.Scanner;

public class MergeSort {
	public static node<Integer> TakeInput(){
		node<Integer> head= null, tail=null;
		Scanner sc = new Scanner(System.in);
		int data=0;
		data=sc.nextInt();
		while(data!=-1) {
			node<Integer> newnode= new node<Integer>(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
			}
			else {
//				
				tail.next=newnode;
				tail=tail.next;
				
			}
			data=sc.nextInt();
		}
		return head;
	}
	public static void print(node<Integer> head) {
		node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	
	public static node<Integer> middle(node<Integer> head){
		node<Integer> slow=head, fast=head;
		while(fast.next!=null && fast.next.next!=null ) {
			slow=slow.next;
			fast=fast.next.next;
			//System.out.println("slow="+slow.data);
			//System.out.println("fast="+fast.data);
			//System.out.println(fast.next.data+" "+fast.next.next.data);
		}
		return slow;
	}
	public static node<Integer> merge(node<Integer> head1,node<Integer> head2){
		node<Integer> t1=head1,t2=head2;
		node<Integer> head=null, tail=null;
		if(t1.data<t2.data) {
			head=t1;
			tail=t1;
			t1=t1.next;
		}
		else {
			head=t2;
			tail=t2;
			t2=t2.next;
		}
		while(t1!=null && t2!=null) {
			if(t1.data<t2.data) {
				tail.next=t1;
				tail=t1;
				t1=t1.next;
			}
			else {
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}
		if(t1!= null){
	        tail.next= t1;
	      }else{
	        tail.next=t2;
	      }
	      return head;
	}
	 
	public static node<Integer> mergesort(node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		else {
			node<Integer> mid=middle(head);
			node<Integer> half1=head;
			node<Integer> half2=mid.next;
			mid.next=null;
			
			mergesort(half1);
			mergesort(half2);
			
			node<Integer> finalhead=merge(half1, half2);
			return finalhead;
		}
	}
	
	public static void main(String[] args) {
		node<Integer> head= TakeInput();
		print(head);
		head=mergesort(head);
		print(head);
		
	}

}
