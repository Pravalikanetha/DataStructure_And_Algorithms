package com.dsa.doublylinkedlist;

public class AddingHead {
	public static class Node {
		int val;
		Node next;
		Node prev;
		Node(int val,Node next){
			this.val=val;
			this.next=next;
		}
		Node(int val){
			this.val=val;
			next = null;
			prev = null;
		}
	}
	static Node AddNewHead(Node head, int val) {
		Node temp = new Node(val);
		temp.prev=null;
		temp.next=head;
		head.prev=temp;
		
		return temp;
	}
	public static void display(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val);
			if(temp.next!=null) {
				System.out.print("<->");
			}
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Node f = new Node(5);
		Node e = new Node(4,f);
		Node d = new Node(3,e);
		Node c = new Node(7,d);
		Node b = new Node(8,c);
		Node a = new Node(1,b);

		b.prev=a;
		c.prev=b;
		d.prev=c;
		e.prev=d;
		f.prev=e;
		
		Node ans = AddNewHead(a, 0);
		display(ans);
	}

}
