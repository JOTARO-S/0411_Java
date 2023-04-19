package jp.sample6;

/* オーバーロード Sample6_3.javaも同様の内容
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

class Human {
	private String name = "名無し";
	private int age = 0;
	
	public Human() { //コンストラクタは用途に応じて使い分ける 初期状態が空の場合 状況に応じて複数設定することも出来る
	}
	public Human(String n, int a) { //コンストラクタは用途に応じて使い分ける 必要な項目を設定している場合 
		this.name = n;
		this.age = a;
	}
	
	public void setData() { //引数なし
	}
	public void setData(String n) { //引数1つ
		name = n;
	}
	public void setData(String n, int a) { //引数2つ
		name = n;
		age = a;
	}
	public void showData() {
		System.out.println("名前は" + name + "さんです。年齢は" + age + "歳です。");
	}
}

public class Sample6_2 {
	public static void main(String[] args) {
		Human h1 = new Human(); //引数なし
		h1.setData();
		h1.showData();
		h1.setData("高橋");
		h1.showData();
		h1.setData("鈴木", 25);
		h1.showData();
		
		Human h2 = new Human("yamada",23); //コンストラクタを２つ用意している為、引数を受け取れるように設定している。
		h2.showData();
	}
}