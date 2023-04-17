package jp.ssie.ocjp;

/*インスタンス化 ⇒ クラスを基にしてオブジェクトを作成すること
 * 
 * クラスをインスタンス化するには、まずインスタンス化したオブジェクトの変数名を宣言する。
 * 
 * クラス名 変数名 = new クラス名();
 * 
 * インスタンス化の変数名の宣言の例　
 * 		Car car1 = new Car();
 * 		Car car2 = new Car();
 * 		Car car3 = new Car();
 * 				 :
 * 				 :
 * 
 * 機能を付ける(値を渡す)には各メソッドを呼び出す必要がある(例であれば色やナンバーなど)
 * 
 * 参照変数名.メソッド名(引数);
 * 
 * インスタンス化のメソッドの呼び出しの例
 * 		car1.setColor("red");
 * 		car2.setColor("blue");
 * 				:
 * 				:
 * 
 * 		car1.setNumber(100);
 * 		car2.setNumber(200);
 * 				:
 * 				:
 * 								etc
 */





public class Sample5_5 {
	public static void main(String[] args) {
		//インスタンス化
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		//メソッドの呼び出し
		car1.setColor("red"); //車の色
		car2.setColor("blue");
		car3.setColor("green");
		
		car1.setNumber(100); //車のナンバー
		car2.setNumber(200);
		car3.setNumber(300);
		
		car1.setGas(20.5); //車の燃料
		car2.setGas(30.5);
		car3.setGas(40.5);
		
		car1.show(); //すべて表示
		car2.show();
		car3.show();
		
	}
}

class Car {
	String color;
	int number;
	double gas;
	
	public void setColor(String c) {
		color = c;
	}
	
	public void setNumber(int n) {
		number = n;
	}
	
	public void setGas(double g) {
		gas = g;
	}
	
	public void show() {
		System.out.println("車の色は" + color + " ナンバーは[" + number + "] 燃料は [" + gas + "]");
	}
}