
/*
 * Java(応用編)
 * 
 * 
 */

package jp.sample12;

import java.util.PriorityQueue;
import java.util.Queue;

public class Sample12_10 {
	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<String>();
		pq.add("C");
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.add("E");
		pq.add("D");
		System.out.println(pq);
		System.out.print(pq.poll());
		System.out.println(pq);
		System.out.print(pq.poll());
		System.out.println(pq);
		System.out.print(pq.peek());
		System.out.println(pq);
	}
}