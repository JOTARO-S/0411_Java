package jp.sample6;

import java.util.ArrayList;

/* 抽象クラス
 * 	処理内容を記述しないメソッドを持つクラスを指す。処理内容を記述しないメソッドを抽象メソッドという。
 * 	対して、インスタンス化するクラスを具象クラスと言う。
 * 
 * 	【修飾子】 abstract class クラス名 {
 * 		【修飾子】 abstract 戻り値の型 メソッド名 (引数の型1 引数名1, 引数の型2 引数名2, ････);
 * 		【修飾子】 戻り値の型 メソッド名 (引数の型1 引数名1, 引数の型2 引数名2, ････) { }
 * 	}
 * 
 * 		抽象クラス、抽象メソッドには頭に abstract キーワードを記述する。
 * 		public abstract class Test { } と記述するとエラーとなる
 * 		抽象メソッドでは処理を持たない為、メソッド名()の後の中カッコ{ }は記入せず、セミコロン ; で終了しなければならない。
 * 
 * 		public abstract void Test(); ⇒ OK
 * 		public abstract void Test() { } ⇒ NG(コンパイルエラー)
 * 
 * 		抽象クラスでは、そのクラス自身をインスタンス化してオブジェクトを生成することはできない。
 * 		通常、抽象クラスは処理を持たないいくつかの抽象メソッドを持っている。抽象クラスを使用する場合、抽象クラスを継承したサブクラスを
 * 		生成しなければならない。その際、extends キーワードを使用し、抽象クラス内の抽象メソッドをサブクラス側で全てオーバーライドする必要がある。
 * 
 * 		abstract class A { //抽象クラス abstractクラス宣言
 * 			String str = "aaa";
 * 			public abstract void show(); //抽象メソッド abstractメソッド
 *		}
 *
 *		class B extends A { // A を 継承した サブクラス B
 *		
 *			@Override //オーバーライドしなければならない
 *			public void show() {
 *				System.out.println(str);
 *		}
 *
 *	継承先での実装を強制する場合
 *		抽象クラスに抽象メソッドを定義することで、その抽象クラスを継承するサブクラスは、
 *		必ずその抽象メソッドを実装する必要があります。これにより、抽象クラスを継承する
 *		全てのサブクラスが必ず実装するメソッドを定義することができます。
 *
 *	共通の機能を提供する場合
 *		抽象クラスには、そのクラスを継承する複数のサブクラスで共通の機能を提供することができます。
 *		例えば、抽象クラスに共通のフィールドやメソッドを定義することで、そのクラスを継承する全てのサブクラスで
 *		同じフィールドやメソッドを利用することができます。
 *
 *	柔軟な設計が必要な場合
 *		抽象クラスを使用することで、柔軟な設計が可能になります。具体的には、抽象クラスを継承するサブクラスを複数定義することで、
 *		それぞれのサブクラスで異なる機能を提供することができます。
 *		また、抽象メソッドを定義することで、そのメソッドを実装するサブクラスによって、異なる処理を実行することができます。
 *
 *
 * 
 */

abstract class Car {
	Car() {
		System.out.println("自動車を作成します");
	}
	abstract public String setLight();
}
class CarA extends Car { //抽象クラスを継承したサブクラス(A社)
	CarA() {
		System.out.println("A社のパーツを使います。");
	}

	public String setLight() {
		return "丸ライト";
	}
}
class CarB extends Car { //抽象クラスを継承したサブクラス(A社)
	CarB() {
		System.out.println("B社のパーツを使います。");
	}

	public String setLight() {
		return "四角ライト";
	}
}

public class Sample6_10 {
	public static void main(String[] args) {
		
		Car a1 = new CarA();
		System.out.println("ライトは " + a1.setLight() + "を取り付けました。");
		
		System.out.println();
		
		Car b1 = new CarB();
		System.out.println("ライトは " + b1.setLight() + "を取り付けました。");
		
		//ArrayList
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new CarA());
		cars.add(new CarB());
		cars.add(new CarA());
		cars.add(new CarB());
		cars.add(new CarA());
		cars.add(new CarB());
		
		//
		for (Car c : cars) {
			System.out.println(c.setLight());
		}
		
	}
}