
/*
 * Java(応用編)
 * 
 * Comparableインターフェース と Comparatorインターフェース
 * 	ソート時の順序関係を独自に規定した場合に使用
 * 	
 * Comparable インターフェース
 * 	Comparableインターフェースは、Java.langパッケージに含まれるクラスでStringやIntegerなどにあらかじめ実装されている。
 * 	そして、各クラスのcompareTo()メソッドを利用することで、順序の比較を行うことが出来る。
 * 
 * 	int compareTo(T o)
 * 
 * 	独自クラスの定義時にComparableインターフェースを実装し、compareTo()メソッドをオーバーライドすることで、
 * 	このオブジェクトを格納したリストおよび配列は、Collections.sort()およびArrays.sort()によって自動的にソート出来る。
 * 
 * 		class Foo implements Comparable<Foo> {
 * 			public int comparaTo(Foo o) {
 * 			//自分自身と引数で受け取ったオブジェクトを比較
 * 			return 整数値;
 * 			}
 * 		}
 * 
 * 		比較した結果、戻り値をして整数値を返している。この時の比較ルールは以下の通り
 * 		
 * 		自オブジェクト == 比較対象オブジェクト ⇒ 戻り値 0, 自オブジェクトが保持する値と比較対象オブジェクトの値が同じ
 * 		自オブジェクト <  比較対象オブジェクト ⇒ 戻り値 負の数, 自オブジェクトが保持する値が、比較対象オブジェクトより小さい
 * 																　(ソートの時、並び順は自オブジェクトが比較対象オブジェクトの前にくる)
 * 		自オブジェクト >  比較対象オブジェクト ⇒ 戻り値 正の数, 自オブジェクトが保持する値が、比較対象オブジェクトより大きい
 * 																　(ソートの時、並び順は自オブジェクトが比較対象オブジェクトの後ろにくる)
 * 
 * Conparatorインターフェース
 * 	Comparatorインターフェースは、java.utilパッケージに含まれるクラスでソートする条件を独自に実装できる。
 * 	比較条件はcompare()メソッドに実装する。
 * 
 * 	int compare(T o1, T o2) 
 * 
 * 	独自クラスの定義時にComparatorインターフェースを実装し、compare()メソッドをオーバーライドする。
 * 
 * 		class TestComparator implements Comparator<Foo> {
 * 			public int compare(Foo o1, Foo o2)
 * 				//第1引数と第2引数のオブジェクトを比較
 * 				return 整数値;
 * 			}
 * 		}
 * 
 * 		比較した結果、戻り値として整数値を返している。この時の比較ルールはComparableインターフェースと同様
 * 
 * 注意点
 * 	
 * 	検索を実行する前には、コレクション(または配列)をソートしておく必要がある。これを実行しなかった場合、検索結果の正しさは保証されない。
 * 
 * 	Comparatorを指定してソートされたコレクションについては、同一のComparatorを用いて検索をする必要があり、
 * 	これを実行しなかった場合、検索結果の正しさは保証されない。
 * 	
 */

package jp.sample12;

import java.util.Arrays;
import java.util.Comparator;

public class Sample12_11 {
	public static void main(String[] args) {
		String[] str = { "Michiko", "Satoshi", "Chieko" };
		
		// ソートしないでbinarySearch()を使用した場合
		System.out.println("ソートなし--------");
		for (String s : str) System.out.print(s + " ");
		System.out.println("\nChieko = " + Arrays.binarySearch(str, "Chieko" ));
		
		// ソートをしてからbinarySearch()を使用した場合
		Arrays.sort(str);
		System.out.println("自然順にソート------");
		for (String s : str) System.out.print(s + " ");
		System.out.println("\nChieko = " + Arrays.binarySearch(str, "Chieko" ));
		
		// Comparatorを使用した場合
		System.out.println("Comparatorを使用して逆順にソート------");
		MyReverseSorter ms = new MyReverseSorter();
		// sort()メソッドの第2引数にComparator
		// 実装クラスのオブジェクトを渡す
		Arrays.sort(str, ms);
		for (String s : str) System.out.print(s + " ");
		// binarySearch()メソッド使用時も
		// Comparator実装クラスのオブジェクトは使用可能
		// 渡さなかった場合
		System.out.println("\nChieko = " + Arrays.binarySearch(str, "Chieko" ));
		// 渡した場合
		System.out.println("Chieko = " + Arrays.binarySearch(str, "Chieko", ms ));
	}
}

// Comparatorインターフェースを実装したクラス
class MyReverseSorter implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}