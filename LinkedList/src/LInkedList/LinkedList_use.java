package LInkedList;

import java.util.Scanner;

public class LinkedList_use {
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
	public static node<Integer> insert(node<Integer> head,int data,int pos){
		node<Integer> newnode = new node<Integer>(data);
		
		if(pos==0) {
			newnode.next=head;
			head=newnode;
		}
		else {
			int i=0;
			node<Integer> temp=head;
			while(i<pos-1) {
				temp=temp.next;
				i++;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
		return head;
	}
	public static node<Integer> delete(node<Integer> head,int pos){
		if(pos==0) {
			return head.next;
		}
		else {
			int i=0;
			node<Integer> temp = head;
			while(i<pos-1) {
				temp=temp.next;
				i++;
			}
			temp.next=temp.next.next;
			return head;
		}
	}
	public static void print(node<Integer> head) {
		node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
//		node<Integer> node1 = new node<Integer>(10);
//		node<Integer> node2 = new node<Integer>(20);
//		node<Integer> node3 = new node<Integer>(30);
//		node1.next=node2;
//		node2.next=node3;
//		node<Integer> head=node1;
//		print(head);
		node<Integer> head=TakeInput();
		print(head);
		head=insert(head,0,0);
		print(head);
		head=insert(head,1,1);
		print(head);
		head=delete(head, 4);
		print(head);
		head=delete(head, 1);
		print(head);

		
	}
} 