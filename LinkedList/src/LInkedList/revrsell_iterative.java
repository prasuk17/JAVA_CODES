package LInkedList;

import java.util.Scanner;

public class revrsell_iterative {
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
	
	public static node<Integer> reverseit(node<Integer> head){
		node<Integer> curr = head;
		node<Integer> prev=null;
		node<Integer> temp=null;
		while(curr!=null) {
			temp= curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
	
	public static void main(String[] args) {
		node<Integer > head = TakeInput();
		print(head);
		head=reverseit(head);
		print(head);
	}
}
