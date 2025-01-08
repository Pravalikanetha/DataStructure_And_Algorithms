package com.dsa.linkedlist;

public class LinkedListDemo {
	public static class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static void displayReverse(Node head) {
		if(head==null)return;
		displayReverse(head.next);
		System.out.println(head.data);
	}
	public static void displayR(Node head) {
		if(head==null)return;
		System.out.println(head.data);
		displayR(head.next);
	}
	public static void display(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	public static int length(Node head) {
		int count=0;
		while(head!=null) {
			count++;
			head= head.next;
		}
		return count;
	}
	public static Node insertAtEnd(Node head, int x) {
		Node val = new Node(x);
		Node temp = head;
		if(head==null) {
			return val;
		}
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=val;
		return head;
	}
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(8);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);

		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;

		displayReverse(a);
		System.out.println();
		int length = length(a);
		System.out.println("length->"+length);
		insertAtEnd(a, 10);
		display(a);
	}  
}

