
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

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Sample12_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NavigableMap<String, String> map = new TreeMap<String, String>();
		map.put("1111", "ItemA");
		map.put("2222", "ItemB");
		map.put("3333", "ItemC");
		map.put("4444", "ItemD");
		map.put("5555", "ItemE");
		
		System.out.println("4桁の数字を入力してください");
		//String key = "2000";
		String key = scanner.next();
		
		if (map.containsKey(key)) { //キーがある場合
			System.out.printf("%s に対応する商品は %s です %n", key, map.get(key));
		} else { //キーが登録されていなかった場合
			String lowerKey = map.lowerKey(key);
			String higherKey =  map.higherKey(key);
			System.out.printf("%s に近い商品 %n" , key);
			if (lowerKey != null) {
				System.out.printf("lower  : %s(%s)%n", map.get(lowerKey), lowerKey);
			}
			if (higherKey != null) {
				System.out.printf("higher  : %s(%s)%n", map.get(higherKey), higherKey);
			}
		}
		NavigableMap<String, String> sub = map.subMap("2000", true, "3500", true);
		System.out.printf("2000 - 3500 : %s", sub);
		scanner.close();
		
	}
}