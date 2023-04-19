package jp.sample6;

/* final修飾子
 * 
 * クラスに使用 ⇒ クラスにfinal修飾子を使用するとクラスを拡張することが出来なくなる
 * 		【アクセス修飾子】 final class クラス名 { }
 * 
 * 変数に使用 ⇒ 変数にfinal修飾子を使用すると変数の値は定数となり変更することが出来なくなる
 * 		【修飾子】 final 変数の型 = 変数の値;			
 * 
 * メソッドに使用 ⇒ メソッドにfinal修飾子を使用するとオーバーライドが出来なくなる
 * 		【アクセス修飾子】 final 戻り値の型 メソッド名(引数) { }
 * 
 * 
 * 
 */

class FinTest {
	final int a = 15; //final指定のインスタンス変数 // 変更不可(final指定されている & staticフィールドから変更が出来ない)
	static final int b = 25; //final指定のstatic変数 // 変更不可(final指定されている)
	static int c = 35; //static変数 // 変更可能
	int d = 45; //インスタンス変数 //変更不可(staticフィールドから変更することが出来ない)
	int e; //インスタンス変数(デフォルト値で初期化) //変更不可(staticフィールドから変更することが出来ない)
	
	void method() {
		int f; //ローカル変数(初期化されていない)
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);
		System.out.println("d " + d);
		System.out.println("e " + e);
		// System.out.println("f " + f); //初期化されていないのでコンパイルエラー
	}
}

public class Sample6_5 {
	public static void main(String[] args) {
		//FinTest.b =50; // b は final なので変更不可
		FinTest.c = 50; // c は 変更可能
		FinTest f = new FinTest();
		f.method();
		
	}
}