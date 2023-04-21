package jp.sample8;

/* 	ローカルクラス
 * 		ローカルクラスとはあるクラスのメソッド内に定義したネストクラスを指す。
 * 		特定のメソッドでしか使用されないクラスを定義する場合など、ローカルクラスを定義するとコードの可読性が向上する。
 * 
 * 		class <外部クラス名> {
 * 			void funcX(...) {
 * 				class <ネストクラス> {
 * 					void funcX(...) {
 * 				}
 * 			}
 * 		}
 * 
 * 		ローカルクラスはメソッド内で定義されるため、メソッド内でのみ有効になる。
 * 		ローカルクラスは外部クラスのメンバという扱いではないため、アクセス修飾子を付けることは出来ず、staticにすることも出来ない。
 * 		ローカルクラスで定義したメソッドの中から外部クラスのどの変数にもアクセス可能。
 * 		ローカルクラスが定義されているメソッド内の変数や引数は、final指定されていなければアクセスできない。
 * 		JDK 8ではfinal指定がなくても値が変更されなければ事実上finalとみなされローカルクラスが定義されているメソッド内の
 * 		変数や引数にもアクセス出来るようになった。ただし、その変数や引数が変更されるとコンパイルエラーとなる。
 * 
 * 
 */

public class Sample8_3 {
	public static void main(String[] args) {	
		LocalOuter outer = new LocalOuter();
		outer.method("param1", "param2");
	}
}


class LocalOuter {
	private String outerVal = "outerVal";
	
	public void method(final String param1, String param2) {
		final int x = 10;
		int y = 20;
		
		// ローカルクラスの定義
		class LocalInner {
			void method() {
				System.out.println("outerVal : " + outerVal);
				System.out.println("x        : " + x);
				System.out.println("y        : " + y);
				
				System.out.println("param1   : " + param1);
				System.out.println("param2   : " + param2);
			}
		}
		LocalInner inner = new LocalInner();
		inner.method();
		outerVal = "hello"; //LocalOuterクラスのインスタンス変数は変更してもエラーが出ない。
		//y = 10; //ここのコメントを外すとSystem.out.println("y     : " + y);でコンパイルエラーが発生
		//param2 = "hello"; //ここのコメントを外すとSystem.out.println("param2   : " + param2);でコンパイルエラーが発生
	}
}