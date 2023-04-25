
/*
 * Java(応用編)
 * 
 * 	ジェネリックス
 * 		
 */

package jp.sample12;

import java.util.ArrayList;

public class Sample12_3 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		String st1 = "ready";
		String st2 = "set";
		String st3 = "go";
		// Integer i = 123;
		myList.add(st1);
		myList.add(st2);
		myList.add(st3);
		//myList.add(i); //コンパイルエラー
		
		/* 従来の書き方
		 for (int i = 0; i < myList.size(); i++) {
		 	String st = (String) myList.get(i);
		 	System.out.println(st);
		 }
		 */
		
		// JDK 5.0 では 以下の書き方が可能
		for (String st : myList) {
			System.out.println(st);
		}
		
		/* Iterator を使った取り出し
		 String st = null;
		 Iterator<String> itr = myList.iterator();
		 while (itr.hasNext()) {
		 	st = itr.next();
		 	System.out.println(st);
		 }
		 */

	}
}