package jp.ssie.ocjp;

/* アクセス制御、アクセス修飾子
 * 	アクセス制御とはあるクラスの属性(変数)や操作(メソッド)に対して、外部に公開するか非公開にするか決めることをいう
 * 	アクセス制御にはアクセス修飾子を使用する
 * 
 * 	public ⇒ クラス〇, メンバ変数〇, メソッド〇, コンストラクタ〇
 * 			  アクセスを制限しない
 * 
 * 	protected ⇒ クラス×, メンバ変数〇, メソッド〇, コンストラクタ〇
 * 				同一クラス内、同一パッケージ内、サブクラスからアクセス可能
 * 
 * 	指定なし ⇒ クラス〇, メンバ変数〇, メソッド〇, コンストラクタ〇
 * 	(default)	同一クラス内、同一パッケージからアクセス可能
 * 
 * 	private ⇒ クラス×, メンバ変数〇, メソッド〇, コンストラクタ〇
 * 				同一クラス内からのみアクセス可能
 * 
 * 
 *  class Person {
 *  	private int a; //修飾子は上記項目参照
 *  	int b;
 *  	protected int c;
 *  	public int d;
 * 	}
 * 
 *  void setA(int a) { //static は つけてしまうとエラー
 *  	
 *  }
 *  
 *  void getA() {
 *  	
 *  }
 * 
 *  public static void main(String[] args) {
 *  	Person.a;
 *  
 *  }
 * 
 * 
 * 
 */

class WorkAc {
	private int a;
	int b;
	public void met(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("a = " + this.a + ", b = " + this.b);
	}
	
	public void show() {
		System.out.println("a = " + this.a + ", b = " + this.b);
	}
}

public class Sample5_12 {
	public static void main(String[] args) {
		WorkAc w1 = new WorkAc();
		
		System.out.println("--- aに3を代入、bに13を代入");
		w1.met(3,13);
		
		//w1.a = 2; //コンパイルエラー(アクセス不可能)
		
		System.out.println();
		System.out.println("--- bに4を代入 ---");
		w1.b = 4; //代入可能
		w1.show();
	}
}