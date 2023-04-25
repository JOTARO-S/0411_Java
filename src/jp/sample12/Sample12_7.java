
/*
 * Java(応用編)
 * 
 * 
 */

package jp.sample12;

import java.util.HashMap;
import java.util.Map;

public class Sample12_7 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "aaa");
		map.put("2", "bbb");
		
		/* ERROR
		 for (String s : map) {
		 	System.out.println(s);
		 }
		 */
		
		//キーの一覧を表示する
		for (String s : map.keySet()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//値の一覧を表示する
		for (String s: map.values()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//キーと値の一覧を表示する
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}