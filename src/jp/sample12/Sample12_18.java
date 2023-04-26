
/*
 * Java(応用編)
 * 
 * NavigableMap と NavigableSet
 * 	NavigableMapインターフェースとNavigableSetインターフェースはJDK6から追加されたJava.utilパッケージのインターフェース
 * 	このインターフェースでは取り出したい値に最も近い要素を返すナビゲーション
 * 
 * NavigableMapインターフェース
 * 	指定されたキーに対し、もっとも近い要素を返すナビゲーションメソッドを持つインターフェース、SortedMapインターフェースのサブインターフェース。
 * 	TreeMapクラスはNavigableMapインターフェースを実装している。
 * 	これによりキーをもとに検索する際に指定したキーが合致していない場合には、指定したキーに近い値を検索することができるようになった。
 * 
 * 	NavigableMapインターフェース
 *		K higherKey(K key) ⇒ 指定されたキーよりも確実に大きいキーの中で最小のものを返す
 *		K lowerKey(K key) ⇒ 指定されたキーよりも確実に小さいキーの中で最大のものを返す		など100p 参照
 *　	
 * NavigableSet インターフェース
 * 	NavigableMapインターフェースとは違い、保持している要素に対してナビゲーションを行う
 * 	NavigrableSetインターフェースはSortedSetインターフェースのサブインターフェースであり、JDK6よりTreeSetクラスは
	NavigableSetインターフェースを実装している。またナビゲーションするためには要素がソートされている必要がある。
	
 *  NavigableSet インターフェース
 * 		E lower (E e) ⇒ セット内で指定された要素よりも確実に小さい要素の中で最大のものを返す	
 * 		E floor (E e) ⇒ セット内で指定された要素よりも等しいかそれよりも小さい要素の中で最大のものを返す	など103p 参照																				
 * 
 * 
 * 
 */

package jp.sample12;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Sample12_18 {
	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("orange");
		set.add("lemon");
		set.add("grape");
		
		System.out.println(set);
		
		//
		System.out.println("lower grape: " + set.lower("grape"));
		System.out.println("floor grape: " + set.floor("grape"));
		
		//
		System.out.println("lower b: " + set.lower("b"));
		System.out.println("floor b: " + set.floor("b"));
		
		//
		System.out.println("ceiling grape: " + set.ceiling("grape"));
		System.out.println("higher grape: " + set.higher("grape"));
		
		//
		System.out.println("ceiling b: " + set.ceiling("b"));
		System.out.println("higher b: " + set.higher("b"));
		
		NavigableSet<String> sub = set.subSet("b", true, "m", true);
		System.out.printf("b - m : %s", sub);
	}
}