package jp.sample6;

/* Java API
 * 	Java API とは Java言語が提供するライブラリ(言語規約)のことを指す
 * 
 *  java.lang.Objectクラスのメソッド
 *  	Javaクラスの階層を構成するルートとなるクラス(ルートとはルートディレクトリの略称で階層構造にて最上階層を指す。)
 *  	全てのクラスはObjectクラスの配下に位置している（extendsを使用する必要はない）
 *  	独自に定義したクラスはObjectクラスを継承したクラスとなる。
 *  	Objectクラスで定義されているメソッドはどのクラスでも使用できる。
 *  
 *  主なObjectクラス
 *  	boolean equals(Object obj) ⇒ equals では オブジェクトの文字列(内容) を比較して同じであるか判断している。　（ ⇒　×　自オブジェクトとobjを比較し、同じオブジェクト(参照先)であれば true を返す()						  
 *  	final Class <?> getClass() ⇒ このオブジェクトの実行時にクラスを返す
 *  	int hashCode() ⇒ オブジェクトのハッシュコード値を返す
 * 		String toString() ⇒ オブジェクトの文字列表現を返す
 * 
 * 
 * 
 * 
 */



public class Sample6_17 {
	public static void main(String[] args) {
		String str1 = "こんにちは"; //String str1 で "こんにちは" を 作成する
		String str2 = "こんにちは"; //String str2 では "こんにちは" がすでに存在している為、同じ参照先を指定している為、オブジェクトは増えない
		
		System.out.println("str1 == str2"); // == では同じオブジェクトかどうかを判断している
		if (str1 == str2) {
			System.out.println("等しい"); //参照先は同じなので結果は 等しい になる
		} else {
			System.out.println("等しくない");
		}
		System.out.println("str1.equals(str2)"); // equals では オブジェクトの文字列(内容) を比較して同じであるか判断している
		if(str1.equals(str2)) {
			System.out.println("等しい"); //オブジェクトの文字(内容)が同じなので結果は 等しい になる
		} else {
			System.out.println("等しくない");
		}
		
		System.out.println();
		
		String obj1 = new String("こんにちは"); //newで新しくオブジェクトを作成している為 "こんにちは" のオブジェクトが2つある
		String obj2 = new String("こんにちは"); //newで新しくオブジェクトを作成している為 "こんにちは" のオブジェクトが2つある
		
		System.out.println("obj1 == obj2"); // == では同じオブジェクトかどうかを判断している
		if(obj1 == obj2) {
			System.out.println("等しい");
		} else {
			System.out.println("等しくない"); //参照先が違うので結果は 等しくない になる
		}
		System.out.println("obj1.equals(obj2)"); // equals では オブジェクトの文字列(内容) を比較して同じであるか判断している
		if(obj1.equals(obj2)) {
			System.out.println("等しい"); //オブジェクトの文字(内容)が同じなので結果は 等しい になる
		} else {
			System.out.println("等しくない");
		}
		
	}
}