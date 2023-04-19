package jp.sample6;

/* オーバーロード Sample6_2.javaと同様の内容
 * 	1つのクラス内で引数の型や数が異なる同一名のメソッドを複数定義すること。(コンストラクタにも使用することが出来る)
 * 	メソッドをオーバーロードすることにより、メソッドを呼び出した際に指定した引数の型や数に応じて、それに対応するメソッドが呼び出される。
 * 	しかし、メソッド名や引数の型が同じでも戻り値の型が違うとエラーになる。
 * 	オーバーロードの例		system.out.println(); など
 * 
 * 		void show() {}
 * 		void show(String str) {}
 * 		void show(int id) {}		//それぞれvoid showであるが、引数の型が違うため複数定義することが可能
 * 
 * 	
 * 
 * 
 */

class Car3 {
	private String color = "決まっていません";
	private int number = 0;
	
	public Car3() {
	}
	public Car3(String c) {
		color = c;
	}
	public Car3(String c, int n) {
		color = c;
		number = n;
	}
	public void show() {
		System.out.println("色は[" + color + "]でナンバーは[" + number + "]です。");
	}
}


public class Sample6_3 {
	public static void main(String[] args) {
		Car3 car1 = new Car3();
		Car3 car2 = new Car3("red");
		Car3 car3 = new Car3("green",1234);
		
		car1.show();
		car2.show();
		car3.show();
		
	}
}