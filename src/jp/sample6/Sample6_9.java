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

class StaffTh {
	private String name = "名無し";
	public void setName(String name) {
		System.out.println("name = " + name); //引数のname
		System.out.println("this.name = " + this.name); //インスタンス変数のname
		this.name = name;
		System.out.println("this.name = " + this.name);
	}
}

public class Sample6_9 {
	public static void main(String[] args) {
		StaffTh s1 = new StaffTh();
		System.out.println("--- メソッド呼び出し ---");
		s1.setName("田中");
	}
}