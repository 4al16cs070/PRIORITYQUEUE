package pac;

import java.util.*;

public class PriOrity {
	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add(10);
		q.add(50);
		q.add(20);
		q.add(60);
		q.add(80);
		q.add(10);
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
	}
}
