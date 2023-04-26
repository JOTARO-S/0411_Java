
/*
 * Java(応用編)
 * 
 * Stream API
 * 	ラムダ式と合わせて使うことでプログラムソースの記述を従来よりも簡略化することが出来る。
 * 	うまく書くことでソースコードの可読性の向上も期待できる。
 * 	Stream APIはStreamオブジェクトを取得し、filterなどのメソッドをメソッドチェインで呼び出して使用する。
 * 
 * 	java.util.stream.Stream インタフェースのメソッド(一部)　詳細は106p
 * 
 * 	Stream<T> distinct() ⇒ このストリームの重複を除いた要素(Object.equals(Object)による)から構成されるストリームを返す
 * 	Stream<T> skip(long n) ⇒ このストリームの最初のn個の要素を破棄した残りの要素で構成されるストリームを返す
 * 
 * 
 */

package jp.sample12;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sample12_19 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(12);
		array.add(123);
		array.add(1234);
		array.add(12345);
		
		// 偶数だけ表示
		// JDK 7までの書き方
		System.out.println("拡張for文を利用");
		for (int num : array) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
		
		//Stream APIを利用した書き方
		System.out.println("Stream APIを利用");
		array.stream() //streamの取得
			.filter(num -> num % 2 == 0) //中間処理(条件に合った要素だけをとり出す) //if文的なやつ
			.forEach(i -> System.out.print(i + " ")); //終端処理(取り出された数字を表示) //for文的なやつ
		
		System.out.println();
		System.out.println("-------------------------");
		
		// 1000以下の奇数だけ取り出して新しいArrayListを作成する
		// JDK 7までの書き方
		System.out.println("拡張for文 + if文");
		ArrayList<Integer> intArray1 = new ArrayList<Integer>();
		for (int num : array) {
			if (num % 2 == 1) {
				if (num <= 1000) {
					intArray1.add(num);
				}
			}
		}
		System.out.println("intArray1 : " + intArray1);
		
		//要素がセットに含まれていない場合
		//Stream APTを利用した書き方
		System.out.println("Stream APIを利用");
		ArrayList<Integer> intArray2 = (ArrayList<Integer>)(array.stream()
																.filter(num -> num % 2 == 1) //if文的なやつ
																.filter(num -> num <= 1000) //if文的なやつ
																.collect(Collectors.toList())); //
		System.out.println("intArray2 : " + intArray2);
		
		System.out.println();
		System.out.println("------------------------------");
		
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(1,"ワンピース", 450));
		
		
		
	}
}

class Book {
	private int id;
	private String name;
	private int price;
	Book(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	void setId(int id) {
		this.id = id;
	}
	void setName(String name) {
		this.name = name;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	
}