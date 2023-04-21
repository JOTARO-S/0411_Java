package jp.sample8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* 関数型インタフェース
 * 		関数型インタフェースとはインタフェースの一種で、抽象メソッドが1つだけ定義されている。
 * 		staticメソッドやdefaultメソッドが含まれていても問題なし。また、Objectクラスに定義されているpublicメソッドが、
 * 		インターフェース内に抽象メソッドとして定義されていても問題ない。
 * 		Oracleが提供しているjava.util.function パッケージには多数の関数型インタフェースが定義されている。
 * 
 * 		java.util.function パッケージに定義されている関数型インタフェース
 * 		
 * 		Consumer< T > ⇒ 単一 の入力引数を受け取って結果を返さないオペレーションを表す
 * 		Predicate< T > ⇒ 1つの引数の述語(boolean値関数) を表す
 * 		Supplier< T > ⇒ 結果のサプライヤを表す
 * 
 *	  		Oracle の Java SE 8 Programmer(日本語)のページテスト内容チェックリストには、
 *	  		トピック「Java AP I主要なクラスの操作」の項目として｢Predicate式を返す簡単なラムダ式を記述する｣と書かれている
 *	  		その為、Predicateインタフェースについては試験を受ける前に簡単な使い方を押さえておくこと
 *
 *	ラムダ式
 *		ラムダ式で記述できるのは関数型インタフェースの形をしているもののみ
 *		
 *		public interface Predicate < T > { //< T >にはジェネリックスが入る
 *			boolean test(T t);
 *			( ... )
 *		}
 *		
 *		Predicateインターフェースには他にも下記のようなdefaultメソッドやstaticメソッドが実装されている。
 *
 *		default Predicate< T > and(Predicate < ? super T > other) ⇒ この述語と別の述語の短絡論理積を表す合成述語を返す
 *		static < T > Predicate < T > isEqual(Object targetRef) ⇒ 2つの引数が等しいかどうかをObjects.equals(Object, Object)に従ってテストする述語を返す
 *		default Predicate < T > ⇒ この述語の論理否定を表す述語を返します
 *		default Predicate < T > or(Predicate < ? super T > other) ⇒ この述語と別の述語の短絡論理和を表す合成述語を返す
 *		boolean test(T t) ⇒ 指定された引数でこの述語を評価する
 */

public class Sample8_5 {
	public static void main(String[] args) {	
		Predicate<String> pre = (String t) -> {
			return t.equals("Hello"); //testメソッドのオーバーライド
		};
		System.out.println(pre.test("Hello"));
		System.out.println(pre.test("1"));
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.forEach(i -> System.out.print(i + " "));
	}
}