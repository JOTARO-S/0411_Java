package jp.sample6;

/* super
 * 	サブクラスからスーパークラスにアクセスする場合 super キーワードを使用する。
 * 	サブクラスでスーパークラスのメソッドをオーバーライドした場合でも、このキーワードを使用すると
 * 	スーパークラスのメソッドにアクセスすることが出来る。
 * 	superキーワードは現在のオブジェクトから見たスーパークラスを指す。
 * 
 * 		super.メソッド名　　super.getName();  のように利用する
 * 
 * 	superクラスのコンストラクタなども呼び出すことが出来る
 * この場合、superの後にメソッドはつかず super(引数)などで記載される。
 * 
 * superキーワードに関しての注意点
 * 	サブクラスのクラスメソッド(staticメソッド)内で扱うことはできない
 * サブクラスはインスタンス化されたスーパークラスのインスタンスメソッドにアクセスすることが出来る。
 * 	サブクラスはインスタンス化されたサブクラスのコンストラクタを実行する前に。スーパークラスのコンストラクタが実行される。
 * 
 * 
 */
class StaffSsp {
	String name = "名無し";
	
	StaffSsp() {
		System.out.println("スーパークラス 名前：" + name );
	}
	
	StaffSsp(String n) {
		name = n;
		System.out.println("スーパークラス 名前：" + name );
	}
}

class ManagerSsp extends StaffSsp {
	ManagerSsp() {
		System.out.println("サブクラス 名前：" + name );
	}
	
	ManagerSsp(String n) {
		super(n); //スーパークラスのコンストラクタを呼び出す StaffSsp(String n) { name = n; }
		System.out.println("サブクラス 名前：" + name );
	}
}

public class Sample6_7 {
	public static void main(String[] args) {
		System.out.println("------- 引数なしのコンストラクタ -------");
		ManagerSsp m1 = new ManagerSsp();
		
		System.out.println();
		System.out.println("------- 引数ありのコンストラクタ -------");
		ManagerSsp m2 = new ManagerSsp("佐藤");
	}
}