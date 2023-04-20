package jp.Practice.p0417;
import java.util.ArrayList;
import java.util.Collections;

public class Practice0417_10 {
	public static void main(String[] args) {
	//Practice0417_10
		ArrayList<Integer> l1 = new ArrayList<>(3);
		l1.add(0,10);
		l1.add(1,20);
		l1.add(2,30);
		
		ArrayList<Integer> l2 = new ArrayList<>(3);
		l2.add(0,11);
		l2.add(1,22);
		l2.add(2,33);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		list.add(l1);
		list.add(l2);
		
		for (ArrayList<Integer> innerList : list) {
			System.out.println("innerList: " + innerList);
			int max = Collections.max(innerList);
			int min = Collections.min(innerList);
			System.out.println("Max: " + max + ", Min: " + min);	
			
			
		int max2 = list.get(0).get(0);
		int min2 = list.get(0).get(0);
		for(ArrayList<Integer> li : list) {
			for(Integer i : li) {
				if(i > max2) max2 = i;
				if(i < min2) min2 = i;
			}
		}
		System.out.println("Max: " + max2 + ", Min: " + min);
		
		}
	}
}
