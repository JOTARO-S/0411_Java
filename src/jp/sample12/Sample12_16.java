
/*
 * Java(応用編)
 * 
 * 
 */

package jp.sample12;

public class Sample12_16 {
	public static void main(String[] args) {
		func(10);
	}
	// 暗黙の変換
	static void func(long i) { System.out.println("(long i)"); }
	
	// autoboxing
	static void func(Integer i) { System.out.println("(Integer i)"); }
	
	// 可変長引数
	static void func(int...  i) {System.out.println("(int... i)"); }
}
// int型の引数を取るメソッドとinteger型の引数を取るメソッドをオーバーロードで定義することは可能だが、呼び出し時は型が合致するものが優先される。
// ただし合致するものがない場合、　拡大変換　＞　autoboxing　＞　可変長パラメータ　の優先度でメソッドが選ばれる