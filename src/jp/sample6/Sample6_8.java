package jp.sample6;

/* this
 * thisキーワードは現在実行中のオブジェクトを表す参照変数です。
 * thisキーワードを使用するとインスタンスメソッドやコンストラクタからそのオブジェクトを自身の他の変数、
 * メソッド、コンストラクタを明示的に指示することが出来る。
 * thisキーワードを使用して変数の指定を行うには
 * 		this.変数名
 * メソッドを呼び出すには
 * 		this.メソッド名()
 * コンストラクタを呼び出すには
 * 		this(引数)
 * 
 * なお、コンストラクタの呼び出しはsuper()と同様にコンストラクタ定義内の一番初めに記入しなければならない。
 * 
 * 
 */

class StaffTs {
	StaffTs() {
		this("佐藤");
	}
	StaffTs(String name) {
		System.out.println("名前" + name );
	}
	
	public void methodM1() {
		System.out.println("メソッドM1");
	}
	public void methodM2() {
		this.methodM1();
		System.out.println("メソッドM2");
	}
}

public class Sample6_8 {
	public static void main(String[] args) {
		System.out.println("---- コンストラクタ呼び出し ----");
		StaffTs s1 = new StaffTs();
		System.out.println("---- メソッド呼び出し ----");
		s1.methodM1();
		s1.methodM2();
	}
}