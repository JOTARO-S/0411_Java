
/*
 * Java(応用編)
 * 
 * Comparableインターフェース と Comparatorインターフェース
 * 	ソート時の順序関係を独自に規定した場合に使用
 * 	
 * Comparable インターフェース
 * 	Comparableインターフェースは、Java.langパッケージに含まれるクラスでStringやIntegerなどにあらかじめ実装されている。
 * 	そして、各クラスのcompareTo()メソッドを利用することで、順序の比較を行うことが出来る。
 * 
 * 	int compareTo(T o)
 * 
 * 	独自クラスの定義時にComparableインターフェースを実装し、compareTo()メソッドをオーバーライドすることで、
 * 	このオブジェクトを格納したリストおよび配列は、Collections.sort()およびArrays.sort()によって自動的にソート出来る。
 * 
 * 		class Foo implements Comparable<Foo> {
 * 			public int comparaTo(Foo o) {
 * 			//自分自身と引数で受け取ったオブジェクトを比較
 * 			return 整数値;
 * 			}
 * 		}
 * 
 * 		比較した結果、戻り値をして整数値を返している。この時の比較ルールは以下の通り
 * 		
 * 		自オブジェクト == 比較対象オブジェクト ⇒ 戻り値 0, 自オブジェクトが保持する値と比較対象オブジェクトの値が同じ
 * 		自オブジェクト <  比較対象オブジェクト ⇒ 戻り値 負の数, 自オブジェクトが保持する値が、比較対象オブジェクトより小さい
 * 																　(ソートの時、並び順は自オブジェクトが比較対象オブジェクトの前にくる)
 * 		自オブジェクト >  比較対象オブジェクト ⇒ 戻り値 正の数, 自オブジェクトが保持する値が、比較対象オブジェクトより大きい
 * 																　(ソートの時、並び順は自オブジェクトが比較対象オブジェクトの後ろにくる)
 * 
 * Conparatorインターフェース
 * 	Comparatorインターフェースは、java.utilパッケージに含まれるクラスでソートする条件を独自に実装できる。
 * 	比較条件はcompare()メソッドに実装する。
 * 
 * 	int compare(T o1, T o2) 
 * 
 * 	独自クラスの定義時にComparatorインターフェースを実装し、compare()メソッドをオーバーライドする。
 * 
 * 		class TestComparator implements Comparator<Foo> {
 * 			public int compare(Foo o1, Foo o2)
 * 				//第1引数と第2引数のオブジェクトを比較
 * 				return 整数値;
 * 			}
 * 		}
 * 
 * 		比較した結果、戻り値として整数値を返している。この時の比較ルールはComparableインターフェースと同様
 * 
 * 注意点
 * 	
 * 	検索を実行する前には、コレクション(または配列)をソートしておく必要がある。これを実行しなかった場合、検索結果の正しさは保証されない。
 * 
 * 	Comparatorを指定してソートされたコレクションについては、同一のComparatorを用いて検索をする必要があり、
 * 	これを実行しなかった場合、検索結果の正しさは保証されない。
 * 	
 */

package jp.sample12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sample12_12 {
	// 匿名クラスを使用してComparator実装クラスの用意
	// compare()メソッドの実装
	static final Comparator<Employee> EMPLOYEE_ID = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2) {
			return e1.getID().compareTo(e2.getID());
		}
	};
	
	//名前順
	static final Comparator<Employee> EMPLOYEE_NAME = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName()); //e1のgetName()とe2のgetName()を比較する 自オブジェクト(e1) < 比較対象オブジェクト(e2)
		}
	};
	
	//ID逆順
	static final Comparator<Employee> EMPLOYEE_ID_REVERSE = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2) {
			return e2.getID().compareTo(e1.getID());
		}
	};
	
	//名前逆順
	static final Comparator<Employee> EMPLOYEE_NAME_REVERSE = new Comparator<Employee>() {
	    public int compare(Employee e1, Employee e2) {
	        return e2.getName().compareTo(e1.getName()); //e2のgetName()とe1のgetName()を比較する 自オブジェクト(e1) > 比較対象オブジェクト(e2)
	    }
	};
	
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Adam",200));
		emp.add(new Employee("Brian",2));
		emp.add(new Employee("Ginny",1));
		emp.add(new Employee("Kulwinder",10));
		emp.add(new Employee("shindy",15));
		
		System.out.println("-------ID順--------");
		
		Collections.sort(emp, EMPLOYEE_ID);
		for (Employee e : emp) {
			System.out.println(e.getName() + " " + e.getID());
		}
		
		System.out.println("-------名前順--------");
		
		Collections.sort(emp, EMPLOYEE_NAME);
		for (Employee e : emp) {
			System.out.println(e.getName() + " " + e.getID());
		}
		
		System.out.println("-------ID逆順--------");
		
		Collections.sort(emp, EMPLOYEE_ID_REVERSE);
		for (Employee e : emp) {
			System.out.println(e.getName() + " " + e.getID());
		}
		
		System.out.println("-------名前逆順--------");
		Collections.sort(emp, EMPLOYEE_NAME_REVERSE);
		for (Employee e : emp) {
			System.out.println(e.getName() + " " + e.getID());
		}
	}
}

class Employee {
	private int id;
	private String name;
	public Employee(String name, int id) {
		this.id = id;
		this.name = name;
	}
	public Integer getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public void sort() {
		
	}
}