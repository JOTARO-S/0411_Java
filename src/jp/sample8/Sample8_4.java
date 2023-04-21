package jp.sample8;

/*　匿名クラス
 * 		匿名クラスとは名前を持たないネストクラスを指す。
 * 		メソッド内でクラスを定義しつつ、そのままインスタンス化し使用する。
 * 
 * 		new <クラス名> () { ... }
 * 		new <インタフェース名> () { ... }
 * 
 * 匿名クラスはあるクラスを1度だけ定義し、それ以降で定義、利用する必要がない場合に有効
 * 既存クラスのサブクラスか、インタフェースを実装するクラスとして定義する。
 * 
 */

public class Sample8_4 {
	public static void main(String[] args) {	
		//外部クラスのオブジェクトを作成
		AnonymityOuter outer = new AnonymityOuter();
		
		//外部クラスメソッドから匿名クラスのオブジェクト生成
		System.out.println("Create the Inner class object");
		outer.makeTheInner();
	}
}
class AnonymitySuper {
	private int i = 0;
	public void display() {
		System.out.println("This is MySuper Class");
		System.out.println("i = " + i);
	}
}


class AnonymityOuter {
	private int size = 5;
	
	public void makeTheInner() {
		//外部クラス
		String str = "local variable";
		final String finalStr = "final variable";
		
		//AnonymitySuperをスーパークラスとして匿名クラスを定義
		(new AnonymitySuper() {
			//匿名クラスのメソッド定義
			//AnonymitySuperメソッドのオーバーライド
			public void display() {
				System.out.println("This is Anonymous Class.");
				System.out.println("finalStr   : " + finalStr);
				System.out.println("size       : " + size);
				//以下はfinal指定ではないが変数strの値が変更されていないため実行可能(JDK 8)
				System.out.println("str  : " + str);
			}
		}).display(); //匿名クラスのメソッド呼び出し
	}
}