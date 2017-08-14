package exercise;

import edu.princeton.cs.algs4.StdOut;

class Node {
		public int x;
		Node next;
}

public class List{
	public static void creat(Node head)
	{
		for (int i = 0;i<10;i++)
		{
			Node tmp = new Node();
			tmp.x = i;
			tmp.next=head.next;
			head.next = tmp;
		}
	}
	public static void main(String[] args) {
		Node head = new Node();
		head.x = -1;
		head.next = null;
		creat(head);
		Node tmp = new Node();
		tmp = head;
		while(tmp!=null) {
			StdOut.println(tmp.x);
			tmp = tmp.next;
		}
		
	}
}