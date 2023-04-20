package jp.sample5;

/* ガベージコレクション
 * 
 * プログラムを実行するとメモリが使用される。その為、メモリ管理はどのプログラミング言語にとっても重要な問題となっている。
 * しかし、Javaはメモリ管理をプログラマではなく実行環境(JVM:Java仮想マシン)が行うためJavaにはどこからも利用されていない
 * (参照されていない)オブジェクトを探しメモリを解放する機能が備わっている。
 * 
 * ガーベジコレクタ
 *  
 *  ガーベジコレクタは使われなくなったオブジェクトをメモリから解放する
 *  
 *  System.gc(); //ガーベジコレクタを促すメソッド
 *  
 *  // Runtimeクラスを使う方法
 *  
 *  Runtime rt = Runtice.getRunTime();
 *  rt.gc();
 *  rt.totalMemory(); //JVM(Java仮想マシン)に割り当てられた合計メモリ容量を戻す
 *  rt.freeMemory(); //JVMの空きメモリ容量を戻す
 *  
 * finalize()メソッド
 *	全てのクラスのスーパークラスであるjava.lang.Objectクラスにはfinelize()メソッドが定義されている
 *	このメソッドは、ガベージコレクタによってオブジェクトが破壊される寸前にJVMにより必ず呼び出されるため、
 *	そのオブジェクトが使っていたリソースを解放するといった処理などを記述することが出来る。
 *		
 *		protected void finalize() 
 *	Objectクラスのfinalize()メソッドは何もしないため、自分が書いたクラスで必要に応じてオーバーライドが可能
 *	しかし、Javaではfinalize()メソッドはオブジェクトメモリが回収される寸前に呼び出されるが、その呼び出しの厳密な
 *	実行タイミングは保証されないと規定されている
 * 	あらゆるクラスのfinalize()メソッドがスーパークラスのfinalize()メソッドを安全に呼び出せるようにするためには、
 * 	以下のようなコードを記述する。
 * 
 * 		protected void finalize() {
 * 			super.finelize();
 * 			//ここからクリーンアップ用のコードが続く
 * 		}
 * 
 * 	ただし、このメソッドが実行されるタイミングをコントロールすることはできないため、
 * 	リソースの解放処理などはfinalize()メソッドの中でのみ記述するのでなく、明示的に呼ばれるように実装すべきとされている。
 */

public class Sample5_10 {
	public static void main(String[] args) {
		// new によるインスタンス化はできない
		// Runtime rt = new Runtime();
		Runtime rt = Runtime.getRuntime();
		System.out.println("JVM free memory before running gc:" + rt.freeMemory());
		rt.gc();
		System.out.println("JVM free memory after running gc:" + rt.freeMemory());
		
	}
}
 
