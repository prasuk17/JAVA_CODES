package LInkedList;

import java.util.Scanner;

public class Insert_Recursively {
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
//				node<Integer> temp =head;
//				while(temp.next!=null) {
//					temp=temp.next;
//				}
//				temp.next=newnode;
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

	public static node<Integer> InsertRecursively(node<Integer> head,int pos,int elem){
		if(pos==0) {
			node<Integer> newnnode= new node<Integer>(elem);
			newnnode.next=head;
			return newnnode;
		}
		head.next = InsertRecursively(head.next, pos-1, elem);
		return head;
	}
	
	public static node<Integer> deleterecursive(node<Integer> head,int pos){
		if(head==null) {
			return null;
		}
		if(pos ==0) {
			return head.next;
		}
		head.next=deleterecursive(head.next, pos-1);
		return head;
	}
	
	public static void main(String[] args) {
		node<Integer> head=TakeInput();
		print(head);
		head=InsertRecursively(head,2,20);
		print(head);
		head=deleterecursive(head, 0);
		print(head);
	}
}
