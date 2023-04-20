package jp.Test;
import java.util.ArrayList;

/*社員情報を管理するクラス
 * 
 * id, 名前, 年齢の情報を保持
 *  コンストラクで各種を初期化
 *  ゲッター、セッターも用意
 *  showメソッドで各情報を表示
 *  
 * メインメソッド側
 * 	3人分のデータを作成
 * 	ArrayList で管理
 * 	一度全情報を表示 各オブジェクトのshowを呼び出し
 * 	3人目の名前を変更
 * 	再度全情報を表示
 */

class Employee {
	int id;
	String name;
	int age;
		
		public Employee(int i, String n, int a) {
			id = i;
			name = n;
			age = a;
		}
		
		//getter
		
		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		//setter
		
		public void setId(int id) {
			this.id = id;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void show() {
			System.out.println("ID: " + id + " 名前: " + name + " 年齢: " + age);
		}
	}




public class Test0417_2 {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		
		Employee emp1 = new Employee(1001,"山田",40);
		Employee emp2 = new Employee(1002,"田中",35);
		Employee emp3 = new Employee(1003,"佐藤",23);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		//下の記述でもOK
		
		//employees.add(new Employee(1001,"山田",40));
		//employees.add(new Employee(1002,"田中",35));
		//employees.add(new Employee(1003,"佐藤",23));
		
		for(Employee e: employees) {
			e.show();
		}
		
		employees.get(2).setName("山田");
		showAll(employees);
		
		for(Employee e: employees) {
			e.show();
		}
		
	}
	
	public static void showAll(ArrayList<Employee> employees) {
	    for(Employee emp: employees) {
	        emp.show();
	    }
	}

	

}

