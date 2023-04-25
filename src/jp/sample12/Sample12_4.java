
/*
 * Java(応用編)
 * 
 * 
 */

package jp.sample12;

import java.util.ArrayList;
import java.util.List;

public class Sample12_4 {
	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Object obj2 = new Object();
		obj2 = obj1; //OK
		
		List<Integer> obj3 = new ArrayList<Integer>();
		List<Object> obj4 = new ArrayList<Object>();
		// obj4 = obj3; //ERROR
		
		System.out.println("obj1: " + obj1 + ", obj2: " + obj2 );
		System.out.println("obj3: " + obj3 + ", obj4: " + obj4 );
	}
}