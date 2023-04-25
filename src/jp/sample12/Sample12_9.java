
/*
 * Java(応用編)
 * 
 * 
 */

package jp.sample12;

import java.util.HashSet;
import java.util.TreeSet;

public class Sample12_9 {
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("B");
		hash.add("C");
		hash.add("D");
		System.out.println("HashSet : "+ hash );
		
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("B");
		tree.add("C");
		tree.add("D");
		System.out.println("HashSet : "+ hash );
	}
}