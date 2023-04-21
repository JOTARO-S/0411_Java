package jp.sample8;

/* ラムダ式
 * 	Java 8から利用可能になった記述方法で、関数型インタフェースを実装する際に使う記述方法
 * 	ラムダ式を扱うにはネストクラスや匿名クラス、関数型インタフェースについて知る必要がある。
 * 
 * 概要
 * 
 * ネストクラス
 * 		クラスの中に定義されたクラスのことを指す。
 * 
 * 匿名クラス
 * 		ネストクラスの一種。
 * 
 * 関数型インタフェース
 * 		インタフェースの一種で、抽象メソッドが1つだけ定義されているインタフェース。
 * 		staticメソッドやdefaultメソッドはいくつ含まれていても問題ない。
 * 
 *  -----------------------------------------------------------------------------------------------------------------------------------------------			
 * 
 * ネストクラス
 * 		トップレベルクラス(今まで学習したクラス)の内部にクラスを定義することをネストクラスと呼ぶ。
 * 		ネストクラスは他のクラスのメンバ(変数やメソッドと同様)である。また、ネストクラスと外部クラスに同じ名前を付けることは出来ない。
 * 
 * 		class <外部クラス名> {
 * 			//外部クラスの変数とメソッド
 * 			...
 * 			
 * 			class <ネストクラス> {
 * 				//ネストクラスの変数とメソッド
 * 				...
 * 			}
 * 		}
 * 
 * 		メソッドのコードブロック内で宣言されたネストクラスはローカルクラスとも呼ばれ、ブロックのスコープ内の任意のfinalなローカル変数にアクセス出来る。
 * 		ネストクラスは、自身が外部クラスのメンバである為、privateメンバを含めて外部クラスのメンバに制限なくアクセス出来る。
 * 		staticなネストクラスは、staticなメンバやstaticイニシャライザを持つことが出来るが、ローカルクラスは持つことが出来ない。
 * 		ネストクラスは他のクラスと同様、かつ同じ意味でabstractまたはfinalとして宣言出来る。
 * 
 * 	比較
 * 
 *  非static ネストクラス											static ネストクラス
 * 
 * 		public class Sample8_1 {										public class Sample8_2 {
 *			public static void main(String[] args) {						public static void main(String[] args) {	
 *				String ext = "From external class";								String ext = "From external class";
 *				//外部クラスのインスタンス化									MyTopLevelS.gateToStatic();
 *				MyTopLevel mt = new MyTopLevel();								MyTopLevelS.StaticNested sn = new MyTopLevelS.StaticNested();
 *				//外部クラスのメソッド呼び出し									sn.accessStaticNested(ext);
 *				mt.createNested();											}
 *				//外部クラスが持つネストクラスのインスタンス化			}
 *				MyTopLevel.MyInner inner = mt.new MyInner();
 *				//ネストクラスのメソッド呼び出し						
 *				inner.accessInner(ext);
 *			}
 *		}
 *		
 *		
 *		class MyTopLevel { //外部クラス									class MyTopLevelS { //外部クラス
 *			private String top = "From Top level class";						private static String top = "From Top level class"; //static
 *			MyInner minn = new MyInner();										public static void gateToStatic() {
 *			//ネストクラスのメソッド呼び出し										StaticNested s = new StaticNested();
 *			public void createNested() {											s.accessStaticNested(top);
 *				minn.accessInner(top);											}
 *			}																	static class StaticNested {
 *			class MyInner { //ネストクラスの定義										public void accessStaticNested(String st) {
 *				public void accessInner(String st) {										System.out.println(st);
 *					System.out.println(st);												}
 *				}																}
 *			}															}
 *		}
 *
 *
 * 
 */

public class Sample8_1 {
	public static void main(String[] args) {	
		String ext = "From external class";
		//外部クラスのインスタンス化
		MyTopLevel mt = new MyTopLevel();
		//外部クラスのメソッド呼び出し
		mt.createNested();
		//外部クラスが持つネストクラスのインスタンス化
		MyTopLevel.MyInner inner = mt.new MyInner();
		//ネストクラスのメソッド呼び出し
		inner.accessInner(ext);
	}
}


class MyTopLevel { //外部クラス
	private String top = "From Top level class";
	MyInner minn = new MyInner();
	//ネストクラスのメソッド呼び出し
	public void createNested() {
		minn.accessInner(top);
	}
	class MyInner { //ネストクラスの定義
		public void accessInner(String st) {
			System.out.println(st);
		}
	}
}