package com.dsa.linkedlist;

public class implementLinkedList {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static class linkedlist {
		Node head = null;
		Node tail = null;
		int size=0;
		
		void insertAtEnd(int val) {
			Node temp = new Node(val);
			if(head==null) {
				head = temp;
			}else {
				tail.next=temp;
			}
			tail=temp;
			size++;
		}
		void display() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		void insertAtStart(int val) {
			Node temp = new Node(val);
			if(head==null) {
				head=tail=temp;
			}else {
				temp.next=head;
				head=temp;
			}
			size++;
		}
//		int size() {
//			return size;
//		}
//		int size() {
//			Node temp = head;
//			int count=0;
//			while(temp!=null) {
//				count++;
//				temp=temp.next;
//			}
//			
//			return count;
//		}
		void insertAt(int idx, int val) {
			Node t = new  Node(val);
			Node temp = head;
			if(idx==size) {
				insertAtEnd(val);
				return;
			}
			else if(idx==0) {
				insertAtStart(val);
				return;
			}
			else if(idx<0||idx>size){
				System.out.println("worng input");
				return;
			}
			for(int i=1; i<=idx-1; i++) {
				temp=temp.next;
			}
			t.next=temp.next;
			temp.next=t;
			size++;
		}
		int getIndex(int idx) {
			if(idx<0||idx>size){
				System.out.println("worng input");
				return -1;
			}
			Node temp=head;
			for(int i=1; i<=idx; i++) {
				temp=temp.next;
			}
			return temp.data;
		}
		void displaySecondLast() {
			Node temp= head;
			while(temp.next!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}
	public static void main(String[] args) {
		linkedlist ll = new linkedlist();
		ll.insertAtEnd(2);
		ll.insertAtEnd(4);
		ll.insertAtStart(1);
		ll.insertAtStart(0);
//		System.out.print(ll.size());
		ll.insertAt(3, 3);
//		ll.insertAt(-1, 9);
		ll.display();
		ll.displaySecondLast();
//		System.out.print(ll.head.data);
		System.out.print(ll.getIndex(8));
	}
}






























