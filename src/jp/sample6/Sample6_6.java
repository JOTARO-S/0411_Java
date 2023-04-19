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
 */

class StaffSp {
	String name = "名無し";
	
	public String getName() {
		return name;
	}
}

class ManagerSp extends StaffSp {
	int salary = 5000000;
	
	public int getSalary() {
		return salary;
	}
	
	@Override					
	public String getName() {
		return "【マネージャー】" + super.getName(); // superキーワードで StaffSp の super.getName() を呼び出している 
	}
}

public class Sample6_6 {
	public static void main(String[] args) {
		StaffSp s1 = new StaffSp();
		System.out.println("------- スーパークラス -------");
		System.out.println("名前:" + s1.getName());
		
		System.out.println();
		ManagerSp m1 = new ManagerSp();
		System.out.println("------- サブクラス -------");
		System.out.println("名前:" + m1.getName());
		System.out.println("給与:" + m1.getSalary());
	}
}