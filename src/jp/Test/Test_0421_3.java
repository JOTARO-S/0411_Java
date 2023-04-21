package jp.Test;

import java.util.ArrayList;

/*

Personクラスを作成
name
age
コンストラクタで2つを設定
getter,setter
処理なしのメソッド introduceを作成 引数、戻り値ともになし

EmployeeクラスをPersonを元に作成
idを持つ
salaryを持つ
コンストラクタでID、名前、年齢を設定
コンストラクタで名前、年齢、給与、IDを設定
introduceをオーバライドし以下が表示されるように
「社員ID：〇〇の〇〇です。」

PartクラスをPersonを元に作成
hourlyPayをもつ
コンストラクタで名前、年齢を設定
コンストラクタで名前、年齢、時給を設定
introduceをオーバライドし以下が表示されるように
「パートのの〇〇です。」

Companyクラスを作成
従業員、パートを管理するstaffList(ArrayList)をインスタンス変数に持つ　
rollcallメソッドを実装し、メソッドが呼ばれると従業員、パートのintroduceが実行されるように
employメソッドを実装し、引数で指定された従業員、またはパートがstaffListに登録されるように

*/

// Parsonクラス
abstract class Parson {
	private String name; //名前
	private int age;	 //年齢
	abstract void introduce(); //iniroduce();
	
	 //名前、年齢のコンストラクタ
	 Parson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Parsonクラス setter
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	//Parsonクラス getter
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}

//スーパークラス Parson の サブクラス Employeeクラス
class Employee extends Parson {
	private int id;
	private long salary;
	
	//名前、年齢、ID の コンストラクタ
	Employee(String name, int age, int id) {
		super(name, age); //super(name, age) でParsonクラスのコンストラクタを適用する
		this.id = id;
	}
	
	//名前、年齢、ID、給与 の コンストラクタ
	Employee(String name, int age, int id, long salary) {
		this(name, age, id);  //this(name, age, id) で上のコンストラクタを適用する
		this.salary = salary; //給与
	}
	
	//Employeeクラス setter
	void setSalary(long salary) {
		this.salary = salary;
	}
	
	//Employeeクラス getter
	int getId() {
		return id;
	}
	long getSalary() {
		return salary;
	}
	
	@Override  //introduceをオーバーライド
	void introduce() {
		System.out.println("社員ID : " + id + "の" + getName() + "です。");
	}
}

//スーパークラス Parson の サブクラス Partクラス
class Part extends Parson {
	private int hourlyPay; //時給
	
	//名前、年齢 の コンストラクタ
	Part(String name, int age) {
		super(name, age);  //super(name, age) でParsonクラスのコンストラクタを適用する
	}
	
	//名前、年齢、時給 の コンストラクタ
	Part(String name, int age, int hourlyPay) {
		this(name, age);  //this(name, age)で上のコンストラクタを適用する
		this.hourlyPay = hourlyPay;
	}
	
	//Partクラス setter
	void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	//Partクラス getter
	int getHourlyPay() {
		return hourlyPay;
	}
	
	@Override //introduceをオーバーライド
	void introduce() {
		System.out.println("パートの" + getName() + "です。");
	}
}

class Company {
	 //ArrayListは1つのクラスしか入らないが、スーパークラスのParsonにすることで継承関係であるEmployeeクラスとPartクラスどちらも入れることが出来る
    private ArrayList<Parson> staffList;
    //praivate ArrayList<Employee> staffList;
    //praivate ArrayList<Part> partList;         分ける必要性があれば2つに分けてもよい 

    Company() { 
        this.staffList = new ArrayList<Parson>(); //CompanyクラスにParsonクラスのArrayListのコンストラクタを適用する
    
    }
    //rollcall() で Parsonクラスの staffListを introduce() 出来るようにする。
    public void rollcall() {
        for (Parson p : staffList) {
            p.introduce();
        }
    }
    
    //employ(Parson parson) で ParsonクラスのデータをstaffListに追加できるようにする。サブクラスであるEmployeeとPartも追加できる。
    public void employ(Parson parson) {
        staffList.add(parson);
    }
}

public class Test_0421_3 {
	
    public static void main(String[] args) {
    	Company com = new Company();
    	Employee em1 = new Employee("山田", 55, 100, 7000000);
    	Employee em2 = new Employee("田中", 35, 101, 5000000);
    	Employee em3 = new Employee("中山", 20, 102, 3000000);
    	Part p1 = new Part("後藤", 40, 3000);
    	Part p2 = new Part("佐藤", 30, 2000);
    	Part p3 = new Part("斎藤", 20, 1000);

    	com.employ(em1);
    	com.employ(em2);
    	com.employ(em3);
    	com.employ(p1);
    	com.employ(p2);
    	com.employ(p3);
    	
    	com.rollcall();	
    }
}

