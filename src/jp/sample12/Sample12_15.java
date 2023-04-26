
/*
 * Java(応用編)
 * 
 * autoboxing
 * 	基本データ型にオブジェクトのように操作の呼び出しは出来ない。
 * 
 * 	個々の基本データには対応するラッパークラスが存在しており、その中にデータを格納すると、これらは通常のオブジェクトと同様に扱える。
 * 	こうした操作のことを boxing と呼ぶ。	
 * 	逆に、いったん格納した基本データ型の値をオブジェクトから取り出すには、値を取得するためのメソッドをラッパーに対して実行する必要がある。
 * 	こうした操作のことを unboxing と呼ぶ。
 * 	今まではboxingとunboxingの処理を必要とする場合、毎回そのコードを書く必要があったが、JDK5よりboxingおよびunboxingの処理を自動化した
 * 	autoboxing という機能が装備されている。
 * 	autoboxing とは基本データの値を、対応するラッパー型に割り当てるための機能であり、その際の変換処理を自動化したもの。
 * 	auto-unboxing とは逆にラッパー型から対応する基本データ型に割り当てるための機能であり、その際の変換処理も自動化されている。
 * 	autoboxing が使えない場合 ラップとアンラップの処理はプログラマが随時記述していく必要がある。
 * 
 * 		public Double areaOfSquare(Double side) {
 * 			double d = side.doubleValue();
 * 			double a = d * d;
 * 			return new Double(a);
 * 		}
 * 
 * 		このコードでは、double型の値をアンラップし、面積を計算してから計算結果を返す前に再度ラップする という処理
 * 		JDK5以前の環境では、こういったboxing unnboxing の処理は逐一プログラマが記述しなければならなかった。
 * 		これに対してJDK5 以降だと次のような記述が可能となっている。
 * 		
 * 		public Double areaOfSquare(Double side) {
 * 			return side * side;
 * 		}
 * 
 * 	boxingとunboxingでは、基本データ型を割り当てられるのは対応するラッパーだけである点に注意が必要
 * 	
 * 		short s = 5;
 * 		int i = s;
 * 		Integer wi = s;  // ERRORとなる
 * 
 * 		ラッパー型と基本データ型の間の変換は、intとInteger、doubleとDoubleというように1対1の関係で行われる。
 * 		基本データ型をラッパーに収めるboxingが実行できない場合、それに対応するautoboxingも実行不可能になる。
 * 
 * 
 */

package jp.sample12;

import java.util.HashMap;

public class Sample12_15 { //クラスの宣言
	public static void main(String[] args) { //mainメソッドの宣言
		HashMap<String, Integer> hm = new HashMap<String, Integer>(); //HashMapの宣言 キーにはString型、値にはInteger型を指定
		for (String word : args) { //拡張for文によるargsのループ argsはコマンドライン引数を表すString型の配列
			Integer freq = hm.get(word); //HashMapからwordに対応する値を取得する 取得した値はInteger型
			hm.put(word, (freq == null ? 1 : freq + 1)); //freqがnullであれば1を、そうでなければfreq+1をHashMapにputするputするキーはword、値は計算結果
		}
		System.out.println(hm); //HashMapの出力 出力される内容はキーと値のペア
	}
}