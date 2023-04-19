package jp.sample6;

/* オーバーライド
 * オーバーライドとはスーパークラスにおいて定義されているインスタンスメソッドをサブクラス内で同じ名前を再定義することをいう。
 * スーパークラスのメソッドを変更することは出来ないが、サブクラスに特化した機能を付与する必要があるときなどに使用する。
 * オーバーライドを使用する場合は、戻り値の型、インスタンスメソッド名、引数の型、引数の数がスーパークラスのメソッドと同じでなければならない。
 * 
 * また、オーバーライドされる側のメソッドに final キーワードがついている場合オーバーライドを行うことが出来ない。
 * オーバーライドする際に @Overrideアノテーション を付与することでオーバーライドの間違いを検出することが出来る。
 * 
 * 
 */

class StaffOv {
	String name = "名無し";
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
}

class ManagerOv extends StaffOv {
	int salary = 5000000;
	
	public int getSalary() {
		return salary;
	}
	
	@Override					// オーバーライド
	public String getName() {
		return "【マネージャー】" + name; //名前の前に【マネージャー】が記載されるようになっている
	}
}

public class Sample6_4 {
	public static void main(String[] args) {
		StaffOv s1 = new StaffOv();
		System.out.println("------- スーパークラス -------");
		System.out.println("名前:" + s1.getName());
		
		System.out.println();
		ManagerOv m1 = new ManagerOv();
		System.out.println("------- サブクラス -------");
		m1.setName("田中");
		System.out.println("名前:" + m1.getName());
		System.out.println("給与:" + m1.getSalary());
	}
}